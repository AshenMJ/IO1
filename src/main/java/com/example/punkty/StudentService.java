package com.example.punkty;

import com.example.punkty.db.IStudentRepository;
import com.example.punkty.db.StudentRow;
import io.vavr.collection.List;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class StudentService {
    private final IStudentRepository repository;

    public StudentService(IStudentRepository repository) {
        this.repository = repository;
    }
    List<Student> getStudents() {
        return List.ofAll(this.repository.findAll())
                .map(getStudentRowStudentFunction());
    }

    private static Function<StudentRow, Student> getStudentRowStudentFunction() {
        return x -> new Student(
                x.getId(),
                x.getName(),
                x.getNumber(),
                x.getGroup()
        );
    }

    Student addStudent(final NewStudent newStudent) {
        StudentRow created = this.repository.save(new StudentRow(
                newStudent.name,
                newStudent.number,
                newStudent.grupa
        ));
        return getStudentRowStudentFunction().apply(created);
    }
}

package com.example.punkty;
import io.vavr.collection.List;



public class StudentService {
    private int id=0;
    public List<Student> students=List.empty();
    public List<Student> getStudents()
    {
    return this.students;
    }
    public Student addStudent(NewStudent student)
    {   Student st1=new Student(id,student.name,student.number,student.grupa);
        students=students.prepend(st1);
        id++;
        return st1;
    }
}

package com.example.punkty;

import io.vavr.collection.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class StudentServiceTest {
    @Test
    public void addStudentIsReturned() {
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("Student1", "1-2-3", "IP"));
        final List<Student> all = service.getStudents();
        Assertions.assertEquals(created.name, all.get(0).name);
    }
    @Test
    public void getStudents() {
    }

    @Test
    public void addStudent() {
        final StudentService service=new StudentService();
        final Student created=service.addStudent(new NewStudent("Student1","1-2-3","IP"));
        assertNotNull(created);
    }
    @Test
    public void getEmptyList(){
        final StudentService service=new StudentService();
        List<Student> students=service.getStudents();
        assertTrue(students.isEmpty());


    }
    @Test
    public void addStudentHasNewId()
    {
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("Student1", "1-2-3", "IP"));
        final Student created2 = service.addStudent(new NewStudent("Student2", "1-2-3", "IP"));
        Assertions.assertNotEquals(created.id,created2.id);
        Assertions.assertEquals(2,service.getStudents().size());

    }

}
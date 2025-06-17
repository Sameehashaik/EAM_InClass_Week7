package com.va.week7;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        Student student = new Student();
        student.setStudentID(id);
        student.setFname("Alice");
        student.setLname("Johnson");
        student.setPhone("1234567890");
        student.setDob("2001-05-15");

        Student.Address address = new Student.Address();
        address.setStreet("Sunset Blvd");
        address.setNo("12B");
        address.setCity("Toronto");

        student.setAddress(address);

        return student;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setStudentID("1");
        s1.setFname("Alice");
        s1.setLname("Johnson");
        s1.setPhone("1234567890");
        s1.setDob("2001-05-15");
        Student.Address address1 = new Student.Address();
        address1.setStreet("Sunset Blvd");
        address1.setNo("12B");
        address1.setCity("Toronto");
        s1.setAddress(address1);

        Student s2 = new Student();
        s2.setStudentID("2");
        s2.setFname("Bob");
        s2.setLname("Smith");
        s2.setPhone("1234567890");
        s2.setDob("2000-12-01");
        Student.Address address2 = new Student.Address();
        address2.setStreet("Ocean Drive");
        address2.setNo("45A");
        address2.setCity("Etobicoke");
        s2.setAddress(address2);

        students.add(s1);
        students.add(s2);

        return students;
    }
}

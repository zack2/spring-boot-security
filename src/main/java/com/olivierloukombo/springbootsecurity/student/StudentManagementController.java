package com.olivierloukombo.springbootsecurity.student;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private  final List<Student> STUDENT = Arrays.asList(
            new Student(1, "Zack olivier"),
            new Student(2, "John Doe"),
            new Student(3, "Jane Doe")
    );

    @GetMapping
    public List<Student> getAllStudents(){
        return STUDENT;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println(student);
    }

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, Student student){
        System.out.println(String.format("%s %s", studentId, student));
    }
}

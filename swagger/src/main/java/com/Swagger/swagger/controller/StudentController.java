package com.Swagger.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Swagger.swagger.model.Student;



@RestController
@RequestMapping("/myapi")
public class StudentController {

ArrayList<Student> studList=new ArrayList<Student>();

@GetMapping("getstudents")
public List<Student> getStudents()
{
return studList;
}

@GetMapping("student/{rollNo}")
public Student getStudent(@PathVariable int rollNo)
{
return studList.get(rollNo);
}


@PostMapping("student")
public Student postStudents(@RequestBody Student student)
{
System.out.println(student);
studList.add(student);
return student;
}

@GetMapping("test")
public Student gettest()
{
return new Student("test",50);
}






}
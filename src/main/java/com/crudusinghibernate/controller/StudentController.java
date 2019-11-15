package com.crudusinghibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudusinghibernate.model.Student;
import com.crudusinghibernate.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/studentlist")
	List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	
	@RequestMapping("/savestudent")
	public Student saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		return student;
	}
	
	@RequestMapping("/getstudent/{studentId}")
	public Student getStudentById(@PathVariable int studentId) {
		Student student= studentService.getStudentById(studentId);
		if(student==null) {
			throw new RuntimeException("Student with id:"+studentId+"not found");
		}
		return student;
	}
	
	@RequestMapping("/deletestudent/{studentId}")
	public String deleteStudentById(@PathVariable int studentId) {
		studentService.deleteStudent(studentId);
		return "Student deleted with id:"+studentId;
		
	}
	

}

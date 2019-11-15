package com.crudusinghibernate.service;

import java.util.List;

import com.crudusinghibernate.model.Student;

public interface StudentService {
	

	List<Student> getAllStudent();
	Student getStudentById(int studentId);
	void saveStudent(Student student);
	void deleteStudent(int studentId);

}

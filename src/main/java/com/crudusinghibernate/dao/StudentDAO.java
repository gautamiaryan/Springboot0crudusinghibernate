package com.crudusinghibernate.dao;

import java.util.List;

import com.crudusinghibernate.model.Student;

public interface StudentDAO {
	
	List<Student> getAllStudent();
	Student getStudentById(int studentId);
	void saveStudent(Student student);
	void deleteStudent(int studentId);

}

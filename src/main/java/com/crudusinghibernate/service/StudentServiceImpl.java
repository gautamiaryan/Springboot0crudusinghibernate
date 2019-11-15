package com.crudusinghibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crudusinghibernate.dao.StudentDAO;
import com.crudusinghibernate.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;

	@Transactional
	@Override
	public List<Student> getAllStudent() {
		return studentDAO.getAllStudent();
	}

	@Transactional
	@Override
	public Student getStudentById(int studentId) {
		return studentDAO.getStudentById(studentId);

	}

	@Transactional
	@Override
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);
	}

	@Transactional
	@Override
	public void deleteStudent(int studentId) {
		studentDAO.deleteStudent(studentId);

	}

}

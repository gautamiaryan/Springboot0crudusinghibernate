package com.crudusinghibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crudusinghibernate.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Student> getAllStudent() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Student> query=currentSession.createQuery("from Student",Student.class);
		List<Student> studentList=query.getResultList();
		return studentList;
	}

	@Override
	public Student getStudentById(int studentId) {
		Session currentSession=entityManager.unwrap(Session.class);
		Student student=currentSession.get(Student.class,studentId);
		return student;
	}

	@Override
	public void saveStudent(Student student) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.save(student);
	}

	@Override
	public void deleteStudent(int studentId) {
		
		Session currentSession= entityManager.unwrap(Session.class);
		Student student=currentSession.get(Student.class,studentId);
		currentSession.delete(student);
		
		
	}

}

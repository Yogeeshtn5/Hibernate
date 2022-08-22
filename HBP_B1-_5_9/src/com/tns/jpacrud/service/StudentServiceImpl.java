package com.tns.jpacrud.service;

import com.tns.jpacrud.dao.StudentDao;
import com.tns.jpacrud.dao.StudentDaoImpl;
import com.tns.jpacrud.entities.Student;

public class StudentServiceImpl implements StudentService{

	private StudentDao studentdao;
	
	public StudentServiceImpl() {
		studentdao=new StudentDaoImpl();
	}

	@Override
	public Student findStudentById(int id) {
		
		Student student =studentdao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.addStudent(student);
		studentdao.commitTransaction();	
	}

	@Override
	public void removeStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.removeStudent(student);
		studentdao.commitTransaction();	
	}

	@Override
	public void updateStudent(Student student) {
		studentdao.beginTransaction();
		studentdao.updateStudent(student);
		studentdao.commitTransaction();	
	}

}

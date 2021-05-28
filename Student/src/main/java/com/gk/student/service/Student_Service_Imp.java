package com.gk.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gk.student.dao.Student_DAO;
import com.gk.student.model.Student;

@Component
public class Student_Service_Imp implements Student_Service {

	@Autowired
	private Student_DAO studentdao;

	@Override
	public Student saveStudent(Student student) {
		return studentdao.save(student);
	}

	@Override
	public List<Student> getStudents() {
		return (List<Student>) studentdao.findAll();
	}

	@Override
	public void deleteStudent(int student) {
		studentdao.deleteById(student);
	}

	@Override
	public Iterable<Student> savestudentlist(List<Student> student) {
		return studentdao.saveAll(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentdao.save(student);
	}

}

package com.gk.student.service;

import java.util.List;

import com.gk.student.model.Student;

public interface Student_Service {

	public Student saveStudent(Student student);

	public List<Student> getStudents();

	public void deleteStudent(int student);

	public Iterable<Student> savestudentlist(List<Student> student);

	public Student updateStudent(Student student);
}

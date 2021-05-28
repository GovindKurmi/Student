package com.gk.student.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gk.student.model.Student;
import com.gk.student.service.Student_Service;

@RestController
@Path(value = "/api")
public class StudentController {

	@Autowired
	private Student_Service studentservice;

	@POST
	@Path("save-student")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public Student saveStudent(@RequestBody Student student) {
		return studentservice.saveStudent(student);

	}

	@POST
	@Path("students-list")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Student> allstudents() {
		return studentservice.getStudents();
	}

	@POST
	@Path("delete-student/{student_id}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteStudent(@PathVariable("student_id") int student_id) {
		studentservice.deleteStudent(student_id);
	}

	@POST
	@Path("student/{student_id}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public Optional<Student> allstudentByID(@PathVariable("student_id") int student_id) {
		return studentservice.getStudentByID(student_id);

	}

	@POST
	@Path("update-student")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public Student updateStudent(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
}

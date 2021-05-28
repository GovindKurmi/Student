package com.gk.student.controller;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Path("savestudent")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public Student saveStudent(@RequestBody Student student) {
		return studentservice.saveStudent(student);

	}

	@GET
	@Path("studentslist")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Student> studentslist() {
		return studentservice.getStudents();
	}

	@DELETE
	@Path("deletestudent/{studentid}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteStudent(@PathParam(value = "studentid") int studentid) {
		studentservice.deleteStudent(studentid);
	}

	@POST
	@Path("savestudentlist")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public Iterable<Student> savestudentlist(@RequestBody List<Student> studentlist) {
		return studentservice.savestudentlist(studentlist);

	}

	@PUT
	@Path("updatestudent")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public Student updateStudent(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
}

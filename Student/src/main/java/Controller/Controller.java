package Controller;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Student;
import Service.Student_Service;

@RestController
@Path(value="/api")
public class Controller {
	
	@Autowired
	private Student_Service studentservice;
	
    @POST
    @Path("save-student")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean saveStudent(@RequestBody Student student) {
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
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean deleteStudent(@PathVariable("student_id") int student_id,Student student) {
		student.setStudent_id(student_id);
		return studentservice.deleteStudent(student);
	}

	@POST
    @Path("student/{student_id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Student> allstudentByID(@PathVariable("student_id") int student_id,Student student) {
		 student.setStudent_id(student_id);
		 return studentservice.getStudentByID(student);
		
	}
	
	@POST
    @Path("update-student/{student_id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public boolean updateStudent(@RequestBody Student student,@PathVariable("student_id") int student_id) {
		student.setStudent_id(student_id);
		return studentservice.updateStudent(student);
	}
}

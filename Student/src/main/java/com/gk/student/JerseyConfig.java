package com.gk.student;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.gk.student.controller.StudentController;


@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(StudentController.class);
	}
}

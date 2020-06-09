package config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import controllerr.StudentController;

@Configuration
public class Configu extends ResourceConfig 
{
   public Configu() 
   {
       register(StudentController.class);
   }
}
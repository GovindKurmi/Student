package com.gk.student.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gk.student.model.Student;

@Repository
public interface Student_DAO extends CrudRepository<Student, Integer>{

}

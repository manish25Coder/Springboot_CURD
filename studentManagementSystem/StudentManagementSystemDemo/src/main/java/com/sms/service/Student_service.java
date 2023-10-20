package com.sms.service;

import java.util.List;

import com.sms.entity.Student_ent;

public interface Student_service {

	Student_ent createStudent(Student_ent student_ent);

	List<Student_ent> getAllStudent();
	
	//for getting data from id
	Student_ent getStudentById(int id);
	
	//updating data by id
	Student_ent updateById(int id,Student_ent student_ent);
	
	//deleting data by id
	String deleteById(int id);
	
}

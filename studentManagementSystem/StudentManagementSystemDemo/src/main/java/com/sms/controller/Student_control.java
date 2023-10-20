package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student_ent;
import com.sms.service.Student_service;

@RestController
@RequestMapping("/api")
public class Student_control {

	@Autowired
	Student_service studentSerive;

	//follow the api path to enter the value
	@PostMapping("/createstudent")
	ResponseEntity<Student_ent> ceateStudent(@RequestBody Student_ent student_ent) {

		return new ResponseEntity<Student_ent>(studentSerive.createStudent(student_ent), HttpStatus.CREATED);

	}
	
	//follow the api path to get the value
	@GetMapping("/getallstudents")
	List<Student_ent> getAllStudent(){
		return studentSerive.getAllStudent();
		
	
		
	}
	//follow the api path to get value by id
	@GetMapping("/getbyid/{sid}")
	Student_ent getStudentById(@PathVariable("sid") int id) {
		
		return studentSerive.getStudentById(id);
		
	}
	
	//follow the api path to update value by id
	@PutMapping("/updatebyid/{sid}")
	Student_ent updateById(@PathVariable("sid") int id,@RequestBody Student_ent student_ent) {
		return studentSerive.updateById(id,student_ent);
		
	}
	
	//follow the api path to delete value by id
	@DeleteMapping("/deletebuid/{sid}")
	String deleteById(@PathVariable("sid") int id) {
		return studentSerive.deleteById(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}

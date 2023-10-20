package com.sms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student_ent;
import com.sms.repository.Student_repo;
import com.sms.service.Student_service;

@Service
public class Student_serviceImpl implements Student_service {

	@Autowired
	Student_repo stdRepo;

	//creating table
	@Override
	public Student_ent createStudent(Student_ent student_ent) {
		return stdRepo.save(student_ent);
	}

	//get all data
	@Override
	public List<Student_ent> getAllStudent() {
		// TODO Auto-generated method stub
		return stdRepo.findAll();
		
	}

	//get data by id
	@Override
	public Student_ent getStudentById(int id) {
		// TODO Auto-generated method stub
		Student_ent stdEnt = stdRepo.findById(id).get();
		return stdEnt;
	}

	//update data by id
	@Override
	public Student_ent updateById(int id, Student_ent student_ent) {
		// TODO Auto-generated method stub
		Student_ent stdEnt1=stdRepo.findById(id).get();
		stdEnt1.setName(student_ent.getName());
		stdEnt1.setAdderess(student_ent.getAdderess());
		stdEnt1.setPhone(student_ent.getPhone());
		return null;
	}
	
	

	//delete data by id
	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		stdRepo.deleteById(id);
		return "Student Deleted Successfully !!! ";
	}

}

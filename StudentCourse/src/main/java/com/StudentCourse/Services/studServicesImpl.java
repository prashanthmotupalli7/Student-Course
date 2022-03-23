package com.StudentCourse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentCourse.entity.Student;
import com.StudentCourse.Repo.studRepository;

@Service
public class studServicesImpl implements studServices{
	@Autowired
	private studRepository studRepo;

	@Override
	public void save(Student stud) {
		studRepo.save(stud);
	}

	@Override
	public List<Student> list() {
		return studRepo.findAll();
	}

	@Override
	public Student findByStudentName(String name) {
		return studRepo.findByStudentName(name);
	}

	@Override
	public Student getById(int id) {
		return studRepo.findById(id).get();
	}

	
	
	
}

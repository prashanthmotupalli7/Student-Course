package com.StudentCourse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentCourse.entity.Course;
import com.StudentCourse.Repo.courseRepository;

@Service
public class courseServicesImpl implements coServices{
	@Autowired
	private courseRepository cRepo;
	
	@Override
	public void save(Course course) {
		cRepo.save(course);
	}

	@Override
	public List<Course> list() {
		return cRepo.findAll();
	}

	@Override
	public Course getById(int id) {
		return cRepo.findById(id).get();
	}
	
}

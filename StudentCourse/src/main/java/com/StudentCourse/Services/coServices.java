package com.StudentCourse.Services;

import java.util.List;

import com.StudentCourse.entity.Course;

public interface coServices {
	void save(Course course);
	
	List<Course> list();
	
	Course getById(int id);
}

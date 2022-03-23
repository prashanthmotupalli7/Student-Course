package com.StudentCourse.Services;

import java.util.List;

import com.StudentCourse.entity.Student;


public interface studServices {
	void save(Student stud);
	
	List<Student> list();
	
	Student getById(int id);

	Student findByStudentName(String name);
}

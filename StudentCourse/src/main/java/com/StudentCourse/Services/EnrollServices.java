package com.StudentCourse.Services;

import java.util.List;

import com.StudentCourse.entity.Enrollment;

public interface EnrollServices {
	String save(Enrollment enroll);

	List<Enrollment> list();
	
	Enrollment fetchById(int id);
	
}

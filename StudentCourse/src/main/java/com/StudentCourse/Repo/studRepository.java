package com.StudentCourse.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentCourse.entity.Student;

public interface studRepository extends JpaRepository<Student, Integer>{

	Student findByStudentName(String string);
	
	
}

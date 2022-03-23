package com.StudentCourse.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentCourse.entity.Course;

public interface courseRepository extends JpaRepository<Course, Integer> {

}

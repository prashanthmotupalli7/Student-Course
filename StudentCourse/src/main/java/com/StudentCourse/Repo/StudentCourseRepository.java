package com.StudentCourse.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.StudentCourse.entity.Course;

@RepositoryRestResource(collectionResourceRel="courses",path="courses")
public interface StudentCourseRepository extends JpaRepository<Course, Integer>{

}

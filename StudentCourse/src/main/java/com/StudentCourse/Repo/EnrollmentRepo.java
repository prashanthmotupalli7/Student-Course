package com.StudentCourse.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.StudentCourse.entity.Enrollment;

@RepositoryRestResource(collectionResourceRel="courses",path="courses")
public interface EnrollmentRepo extends JpaRepository<Enrollment, Integer>{

}

package com.StudentCourse.EnrollController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentCourse.entity.Course;
import com.StudentCourse.Services.coServices;

@RestController
public class CourseController {
	
	@Autowired
	private coServices cServices;
	
	@RequestMapping(value="/course", produces="application/json")
	public String addCourse(@RequestBody Course course) {
		cServices.save(course);
		return "Course Saved";
	}
	
	@GetMapping(value="/courses", produces="application/json")
	public List<Course> getList(){
		return cServices.list();
	}
}

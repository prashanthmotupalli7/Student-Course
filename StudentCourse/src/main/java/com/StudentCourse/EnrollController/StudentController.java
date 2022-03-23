package com.StudentCourse.EnrollController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.StudentCourse.entity.Student;
import com.StudentCourse.Services.studServices;

@RestController
public class StudentController {
	@Autowired
	private studServices sServices;
	
	@PostMapping(value="/student")
	public String addStudent(@RequestBody Student stud) {//localhost:8080/student
		sServices.save(stud);
		return "Student Saved";
	}
	
	@GetMapping(value="/students", produces="application/json")
	public List<Student> getlist(){
		return sServices.list();
	}
}

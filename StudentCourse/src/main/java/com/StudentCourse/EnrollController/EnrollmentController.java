package com.StudentCourse.EnrollController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.StudentCourse.Services.EnrollServices;
import com.StudentCourse.entity.Enrollment;

@RestController
public class EnrollmentController {
	
	@Autowired
	private EnrollServices eServices;
	
	@PostMapping(value="/enroll",consumes="application/json")
	public String enrollStud(@RequestBody Enrollment enroll) {
		String str = eServices.save(enroll);
		return str;
	}
	
	@GetMapping(value="/enrolls",produces="application/json")
	public List<Enrollment> list(){
		return eServices.list();
	}
	
	@GetMapping(value="/enrollment/{enrollmentId}" , produces="application/json")
	public Enrollment getEnroll(@PathVariable int enrollmentId) {
		return eServices.fetchById(enrollmentId);
	}
}

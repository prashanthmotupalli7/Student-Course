package com.StudentCourse.Services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentCourse.Repo.EnrollmentRepo;
import com.StudentCourse.Repo.courseRepository;
import com.StudentCourse.entity.Course;
import com.StudentCourse.entity.Enrollment;

@Service
public class EnrollServicesImpl implements EnrollServices {
	@Autowired
	private EnrollmentRepo enrollRepo;
	
	@Autowired
	private courseRepository cRepo;

	@Override
	public String save(Enrollment enroll) {
		//restrict duplicates
		List<Enrollment> enrollments = enrollRepo.findAll();
		boolean present = false;
		String str;
		for (Enrollment enrollment : enrollments) {
			if ((enrollment.getCourse().getCourseId() == enroll.getCourse().getCourseId())
					&& (enrollment.getStud().getStudentId() == enroll.getStud().getStudentId())) {
				present = true;
				break;
			}
		}
		if (present)
			str = "Duplicate Record Exist";

		else {
			Course course = cRepo.findById(enroll.getCourse().getCourseId()).get();
			LocalDate endDate = enroll.getStartDate().plusDays(course.getDuration());
			enroll.setEndDate(endDate);
			enrollRepo.save(enroll);
			str = "Student enrollment to course Successful\n";
		}
		return str;
	}

	@Override
	public List<Enrollment> list() {
		return enrollRepo.findAll();
	}

	@Override
	public Enrollment fetchById(int id) {
		return enrollRepo.findById(id).get();
	}

}

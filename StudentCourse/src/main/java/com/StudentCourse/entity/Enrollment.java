package com.StudentCourse.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enrollment")
public class Enrollment {

	/**
	 * 
	 */
	public Enrollment() {
		super();
	}

	@Id
	@GeneratedValue
	private int enrollmentId;

	@OneToOne(targetEntity = Student.class)
	@JoinColumn(name = "studentId_Fk")
	private Student stud;

	@OneToOne(targetEntity = Course.class)
	@JoinColumn(name = "courseId_Fk")
	private Course course;

	@Column
	private LocalDate startDate;

	@Column
	private LocalDate endDate;


	

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
}

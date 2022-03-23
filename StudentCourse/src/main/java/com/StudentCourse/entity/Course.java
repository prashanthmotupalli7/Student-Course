package com.StudentCourse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {


	@Id
	private int courseId;
	@Column(length = 20)
	private String courseName;
	@Column(length = 20)
	private int duration;
	@Column(length = 20)
	private String onOrOff;

	public String getOnOrOff() {
		return onOrOff;
	}

	public void setOnOrOff(String onOrOff) {
		this.onOrOff = onOrOff;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}

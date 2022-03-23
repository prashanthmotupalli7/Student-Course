package com.StudentCourse.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Student")
public class Student {

	/**
	 * 
	 */
	public Student() {
		super();
	}

	@Id
	private int studentId;
	@Column(length = 20, nullable=false)
	private String studentName;
	@Column(length = 1,name = "Gender")
	private char gender;
	@Column
	@DateTimeFormat(pattern = "DD/MM/YYYY")
	private LocalDate dob;
	
	
	@Transient
	private int studId;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}

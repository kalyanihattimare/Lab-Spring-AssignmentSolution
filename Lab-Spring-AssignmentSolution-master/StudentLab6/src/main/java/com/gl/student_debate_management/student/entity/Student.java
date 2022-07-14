package com.gl.student_debate_management.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // create table Student in h2 database

public class Student {

	
	@Column(name="student_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String course;
	private String country;
	
	public Student(String firstname, String lastname, String course, String country) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.country = country;
	}

	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

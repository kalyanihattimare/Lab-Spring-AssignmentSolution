package com.gl.student_debate_management.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.student_debate_management.student.entity.Student;
	
	public interface StudentRepository extends JpaRepository<Student, Integer> {
		
		public List<Student> findByFirstnameContainsAndLastnameContainsAndCourseContainsAndCountryContains(String firstname, String lastname, String course, String country);
		
			
		}
	


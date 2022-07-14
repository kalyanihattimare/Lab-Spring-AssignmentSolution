package com.gl.student_debate_management.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.student_debate_management.student.entity.User;
import com.gl.student_debate_management.student.repository.UserRepository;
import com.gl.student_debate_management.student.security.StudentUserDetail;
@Service
public class UserServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepo;


	@Override
	public UserDetails loadUserByUsername(String username) {
		User user=userRepo.getUserByUserName(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User "+username+" not found!!!");
		}
		
		UserDetails studentUserDetails=new StudentUserDetail(user);
		return studentUserDetails;
	}

}

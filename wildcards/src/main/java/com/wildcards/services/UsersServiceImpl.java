package com.wildcards.services;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildcards.dao.UsersDao;
import com.wildcards.models.Users;

@Service
public class UsersServiceImpl implements UsersService {
	
	
	private UsersDao ud;
	
	@Autowired
	EmailService es;
	
	@Autowired
	public UsersServiceImpl(UsersDao ud) {
		this.ud = ud;
	}	
	
	@Override
	public List<Users> getAllUsers() {
		return ud.findAll();
	}

	@Override
	public Users createUsers(Users u) {
		es.sendSignUpEmail(u.getEmail(), "This is a test email for your website");
		return ud.save(u);
		//return u
	
		//this service will send a request to emailService 
		//save the user
		//if it succeeds then call the emailservice with new new users email
		//then return user
		
		// TODO Auto-generated method stub
//		return ud.save(u);
	}
	

	@Override
	public Users getUserByID(int id) {
		// TODO Auto-generated method stub
		return ud.getOne(id);
	}

	@Override
	@Transactional
	public Users updateUsers(Users u) {
		// TODO Auto-generated method stub
		Users previousUser = ud.getOne(u.getUserId());
		if(u.getFirstName() != null) {
			previousUser.setFirstName(u.getFirstName());
		}
		if(u.getLastName() != null) {
			previousUser.setLastName(u.getLastName());
		}
		if(u.getUsername() != null) {
			previousUser.setUsername(u.getUsername());
		}
		if(u.getPassword() != null) {
			previousUser.setPassword(u.getPassword());
		}
		
		if(u.getEmail() != null) {
			previousUser.setEmail(u.getEmail());
		}
		return previousUser;
	}

	@Override
	public Users loginUsers(String username, String password) {
		// TODO Auto-generated method stub
		return ud.findByUsernameAndPassword(username, password);
	}
	


}

package com.wildcards.services;

import java.util.List;

import com.wildcards.models.Users;

public interface UsersService {

	public List<Users> getAllUsers();

	public Users createUsers(Users u);
	
	public Users getUserByID(int id);
	
	public Users updateUsers(Users u);
	
	public Users loginUsers(String username, String password);



}

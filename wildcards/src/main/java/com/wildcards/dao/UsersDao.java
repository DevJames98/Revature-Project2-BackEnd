package com.wildcards.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcards.models.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, Integer> {
	
	public Users findByUsernameAndPassword(String username, String password);


}

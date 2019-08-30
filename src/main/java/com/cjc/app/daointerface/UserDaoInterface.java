package com.cjc.app.daointerface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cjc.app.model.Users;

public interface UserDaoInterface extends CrudRepository<Users, Integer>{

	public Users findAllByUsernameAndPassword(String name, String pass); 
	
	public Users findAllByUsername(String name);
	
}

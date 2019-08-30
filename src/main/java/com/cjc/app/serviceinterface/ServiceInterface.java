package com.cjc.app.serviceinterface;

import java.util.List;

import com.cjc.app.model.Users;

public interface ServiceInterface {

	public Users loginUsers(Users user);

	public List<Users> getAll();
	
	public List<Users> deleteUser(int id);
	
	public void saveUser(Users user);
	
	public Users editUser(int id);
}

package com.cjc.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.daointerface.UserDaoInterface;
import com.cjc.app.model.Users;
import com.cjc.app.serviceinterface.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface{

	@Autowired
	UserDaoInterface dao;
	
	@Override
	public Users loginUsers(Users user) {
		// TODO Auto-generated method stub
		return dao.findAllByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
	
	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return (List<Users>) dao.findAll();
	}
	
	@Override
	public List<Users> deleteUser(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		return getAll();
	}
	
	@Override
	public void saveUser(Users user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}
	
	@Override
	public Users editUser(int id) {

		return dao.findOne(id);
	}
	
}

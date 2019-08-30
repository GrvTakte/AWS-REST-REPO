package com.cjc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.app.model.Users;
import com.cjc.app.serviceinterface.ServiceInterface;

@Controller
public class HomeController {

	@Autowired
	ServiceInterface service;
	
	@RequestMapping("/")
	public String firstAction() {
		System.out.println("inn");
		return "login";
	} 
	
	@RequestMapping("/login")
	public String loginAction(@ModelAttribute Users user, ModelMap map) {
		Users user1 = service.loginUsers(user);
		if(user1!=null) {
			System.out.println("i suces..");
			List<Users> list = service.getAll();
			map.addAttribute("list",list);
			return "success";
		}else {
			System.out.println("in errr");
			return "exception123";
		}
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int id, ModelMap map) {
		
		List<Users> list = service.deleteUser(id);
		map.addAttribute("list",list);
		return "success";
	}
	
	@RequestMapping("/reg")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String registerUser(@ModelAttribute Users user) {
		service.saveUser(user);
		return "login";
	}
	
	@RequestMapping("/edit")
	public String editUser(@RequestParam int id, ModelMap map) {
		Users user = service.editUser(id);
		map.addAttribute("user",user);
		return "update";
	}
	
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute Users user, ModelMap map) {
		service.saveUser(user);
		List<Users> list = service.getAll();
		map.addAttribute("list",list);
		return "success";
	}
	
}

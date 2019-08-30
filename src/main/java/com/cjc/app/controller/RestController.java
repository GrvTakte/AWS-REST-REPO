package com.cjc.app.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.app.model.Users;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/get/user")
	public Users loginAction() {
		Users u = new Users();
		u.setUid(123);
		u.setUsername("gaurav@automation.com");
		u.setPassword("password123");
		return u;
	}

}

package com.prepupzone.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("userid") && password.equals("dummy");
	}

}
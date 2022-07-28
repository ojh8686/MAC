package com.mac.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mac.demo.mappers.LoginMapper;
import com.mac.demo.model.User;

@Service
public class LoginService {

	@Autowired
	private LoginMapper dao;
	
	
	public String loginUser(String idMac, String pwMac){
		
		return dao.loginUser(idMac,pwMac);
	}
}

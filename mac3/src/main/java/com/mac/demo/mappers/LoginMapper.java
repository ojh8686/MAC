package com.mac.demo.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.mac.demo.model.User;

@Mapper
public interface LoginMapper {
	String loginUser(String idMac, String pwMac);
}

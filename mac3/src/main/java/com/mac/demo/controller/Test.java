package com.mac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.mac.demo.mappers.BoardMapper;
import com.mac.demo.model.Board;

public class Test {

	@Autowired
	private static BoardMapper dao;
	
	public static void main(String[] args) {
		Board board = new Board();
		board.setPcodeMac(0);
		board.setNicknameMac("옥종훈");
		
		try {
			dao.save(board);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}  

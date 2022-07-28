package com.mac.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mac.demo.model.User;
import com.mac.demo.service.LoginService;


@RequestMapping("/login")
@Controller
public class LoginController {
	
	@Autowired
	private LoginService svc;
	
//	로그인폼
	@GetMapping("/loginForm")
	public String login() {
		
		return "thymeleaf/mac/login/loginForm";
	}
	
//	세션에 id저장
	@PostMapping("/loginForm")
	public String login(@RequestParam("idMac")String idMac, @RequestParam("pwMac")String pwMac, User user, HttpSession session,Model model){
		
		//db에 사용자가 입력한 id와 pw가 있는지 확인
		System.out.println("아이디"+idMac);
		System.out.println("비밀번호"+pwMac);
//		id,pw가 맞을시 문자열checkedId에 id저장
		
		String checkedId= svc.loginUser(idMac,pwMac);
		System.out.println("로그인체크드아이디"+checkedId);
		
//		checkdeId에 데이터가 있을시 세션에 id저장
		if(idMac.equals(checkedId)) {
		session.setAttribute("idMac", idMac);
		model.addAttribute("idMac",session.getAttribute("idMac").toString());
		model.addAttribute("msg", session.getAttribute("idMac").toString()+"님 환영합니다");
		//return map;
		
		System.out.println("로그인이 되었습니다");
		return "thymeleaf/mac/home/home";
		}else if(checkedId==null) {
			model.addAttribute("msg","잘못된 아이디나 비밀번호 입니다");
			
			return "thymeleaf/mac/login/loginForm";
		}
		System.out.println("로그인이 실패하였습니다");
		return "thymeleaf/mac/home/dataSource";
	
	}
	
//	로그아웃메소드
	@GetMapping("/logout")
	@ResponseBody
	public Map<String,Object> logout(HttpSession session) 
	{
		session.invalidate();
		
		Map<String,Object> map = new HashMap<>();
		map.put("logout", true);
		return map;
	}
	
//	로그인 확인
	@GetMapping("/loginCheck")
	@ResponseBody
	public Map<String,Object> loginCheck(HttpSession session) 
	{
		session.invalidate();
		
		Map<String,Object> map = new HashMap<>();
		map.put("logout", true);
		return map;
	}
	
}

package com.hadine.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hadine.web.dto.LoginDTO;
import com.hadine.web.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@GetMapping("/login")
	public String login( ) {
		
		return "/login";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest request) {
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pw"));
		
		LoginDTO dto = new LoginDTO();
		dto.setId(request.getParameter("id"));
		dto.setPw(request.getParameter("pw"));
		
		dto = loginService.login(dto); //count(*), 이름, 아이디
		System.out.println(dto);
		//LoginDTO(count=1, id=siggy, pw=null, m_name=정식)
		
		if (dto.getCount()==1) {
			return "redirect:/board";
		} else {
			return "redirect:/login";
		}		
	}
}

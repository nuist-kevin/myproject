package com.caiwen.springLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller(value="/testlogin")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String getLoginPage() 
	{
		return "login";
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public String doLogin( @RequestParam(value="userEmail") String userEmail,
			@RequestParam(value="userPassword") String userPassword) 
	{
		if(userEmail.equals("nuist_kevin@163.com") && userPassword.equals("6886377")) {
			return "redirect:/Main";
		}
		else {
			return "failed";
		}
	}
}

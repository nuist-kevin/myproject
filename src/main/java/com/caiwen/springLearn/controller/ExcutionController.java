package com.caiwen.springLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(value="/execution")
public class ExcutionController {

		@RequestMapping(method = RequestMethod.GET)
		public String getLoginPage() 
		{
			boolean isLogin = true;
			if (isLogin) {
				return "execution";
			} else {
				return "loginRequired";
			}
		}
}
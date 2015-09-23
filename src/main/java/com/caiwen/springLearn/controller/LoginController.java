package com.caiwen.springLearn.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller(value = "/testlogin")
@SessionAttributes({ "userName", "loginTime" })
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String getLoginPage(HttpServletRequest request) {
	// �ж�����ѵ�¼��������ҳ��
	if (request.getSession().getAttribute("userName") != null) {
	    return "redirect:/Main";
	}
	return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doLogin(@RequestParam(value = "userEmail") String userEmail,
	    @RequestParam(value = "userPassword") String userPassword, HttpServletRequest request) {

	//
	// ���δ��¼��У���û��������Ƿ���ȷ
	if (userEmail.equals("nuist_kevin@163.com") && userPassword.equals("6886377")) {
	    // �û���������ȷ����¼session״̬���������û������͡���¼ʱ�䡿
	    HttpSession session = request.getSession();
	    session.setAttribute("userName", userEmail);
	    session.setAttribute("loginTime", new Date());
	    return "redirect:/Main";
	} else {
	    return "failed";
	}
    }
}

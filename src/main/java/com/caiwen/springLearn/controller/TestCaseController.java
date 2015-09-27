package com.caiwen.springLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testcases")
public class TestCaseController {
    
    @RequestMapping("/add")
    public String addTestCase() {
	return "/testcases/add";
    }
}

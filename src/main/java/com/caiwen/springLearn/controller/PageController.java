package com.caiwen.springLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class PageController {
    
    @RequestMapping("/add")
    public String addPage() {
	return "/pages/add";
    }
    
    @RequestMapping("/list")
    public String listPages() {
	return "/pages/list";
    }
}

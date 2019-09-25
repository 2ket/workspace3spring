package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

import com.bit.framework.Controller;

public class IndexController implements Controller {

	public IndexController(){
		System.out.println("new IndexController...");
	}
	
   public String execute(HttpServletRequest req) {
      req.setAttribute("msg", "환영합니다.");
      return "index";
   }

}
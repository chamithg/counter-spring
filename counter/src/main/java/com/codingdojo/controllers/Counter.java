package com.codingdojo.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
@Controller
public class Counter {
	
	
	 @RequestMapping("//your_server")
	 public String index(HttpSession session ) {
		 if (session.getAttribute("count") == null) {
			 session.setAttribute("count", 0);
		 }else {
			 int count = (Integer)session.getAttribute("count") +1;
			 session.setAttribute("count", count);
		 }
	     return "index.jsp";
	 }
	 @RequestMapping("//your_server/counter")
	 public String counter(HttpSession session, Model model ) {
		 int count;
		 if(session.getAttribute("count")==null) {
			 count = 0;
		 }else {
			 count = (Integer)session.getAttribute("count");
		 }
		 
		 model.addAttribute("count",count);
	     return "counter.jsp";
	 }
	

}

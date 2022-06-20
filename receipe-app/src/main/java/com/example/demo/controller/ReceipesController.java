package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Receipes;
import com.example.demo.service.service;

import java.util.List;

@Controller
public class ReceipesController {
	@Autowired
	service ser;
	
	
	
	@RequestMapping("/add")
	public String addd(Receipes r) {
		
		if(r.getName()==null) {
			
		}else {
			
			ser.save(r);
		}
		
		return "Homepage";
	}
	@RequestMapping("/")
	public ModelAndView getall() {
		ModelAndView mv=new ModelAndView();
		List<Receipes> R= ser.findall();
		
		mv.addObject("R",R);
		mv.setViewName("Home");
		return mv;
	}
	@RequestMapping("/s")
	public String gat() {
		return "delete";
	}
	
	@RequestMapping("/delete")
	public void deletebyid(int id) {
		System.out.println("hgsj");
		ser.delete(id);
		
	}
	@RequestMapping("/se")
	public String updatee() {
		return "update";
	}
	@RequestMapping("/update")
	public void updatevalue(Receipes r) {
		ser.update(r);
		
	}
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {

         System.out.println("tess");
        
		 ser.delete(id);
		 return "redirect:/";

	}
	
	
}

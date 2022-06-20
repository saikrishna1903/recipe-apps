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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
		ser.delete(id);
		
	}
	@RequestMapping("/se/{id}")
	public ModelAndView updatee(@PathVariable int id) {
		Receipes r=ser.findById(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("r",r);
		mv.setViewName("update");
		return mv;
		
	}
	@RequestMapping("/update")
	public String updatevalue(Receipes r) {
		ser.update(r);
		return "redirect:/";
	}
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {

        
		 ser.delete(id);
		 return "redirect:/";

	}
	
	
}

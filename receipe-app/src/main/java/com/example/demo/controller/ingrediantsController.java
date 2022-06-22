package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Receipes;
import com.example.demo.model.ingredients;
import com.example.demo.service.service;

@Controller
public class ingrediantsController {
	@Autowired
	service ser;
    @RequestMapping("/ing")
	public void ingredientsList(String s) {
		Receipes r=new Receipes();
		List<String> l=r.getvaluess(s);
		int c=0;
		for(String i:l) {
			ingredients in=new ingredients();
			in.setIng_name(i);
			ser.save(in);
		}


	}

}

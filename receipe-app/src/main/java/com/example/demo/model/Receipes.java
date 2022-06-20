package com.example.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Receipes {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String DateTime;
	private String TypeOfDish;
	private int SuitableFor;
	private String Ingredients;
	private String CookingInstructions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	public String getTypeOfDish() {
		return TypeOfDish;
	}
	public void setTypeOfDish(String typeOfDish) {
		TypeOfDish = typeOfDish;
	}
	public int getSuitableFor() {
		return SuitableFor;
	}
	public void setSuitableFor(int suitableFor) {
		SuitableFor = suitableFor;
	}
	public String getIngredients() {
		return Ingredients;
	}
	public void setIngredients(String ingredients) {
		Ingredients = ingredients;
	}
	public String toString() {
		String s="Receipes [id=" + id + ", name=" + name + ", DateTime=" + DateTime + ", TypeOfDish=" + TypeOfDish
				+ ", SuitableFor=" + SuitableFor + ", Ingredients=" + Ingredients + ", CookingInstructions="
				+ CookingInstructions + "]";
		List<String> list=new ArrayList<String>(Arrays.asList(s.split(",")));
		System.out.println("fsd");
		System.out.println(list);
		return "Receipes [id=" + id + ", name=" + name + ", DateTime=" + DateTime + ", TypeOfDish=" + TypeOfDish
				+ ", SuitableFor=" + SuitableFor + ", Ingredients=" + Ingredients + ", CookingInstructions="
				+ CookingInstructions + "]";
		
		 
	}
	public String getCookingInstructions() {
		return CookingInstructions;
	}
	public void setCookingInstructions(String cookingInstructions) {
		CookingInstructions = cookingInstructions;
	}
	public List<String> getList(){
		String s="" + id + "," + name + "," + DateTime + "," + TypeOfDish
				+ "," + SuitableFor + "," + Ingredients + ","
				+ CookingInstructions;
		List<String> list=new ArrayList<String>(Arrays.asList(s.split(",")));
		return list;
	}

	public List<String> getvaluess(String h){
		System.out.println(h);
		ArrayList<String> l=new ArrayList<String>();
		String d="";
		for(int i=0;i<h.length();i++) {
			
			if(h.charAt(i)=='.') {
				l.add(d);
				d="";
				
			}else {
				d=d+h.charAt(i);
			}
			

		}System.out.println(l);
		return l;
	}
}

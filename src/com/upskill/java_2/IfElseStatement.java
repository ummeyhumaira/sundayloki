package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int age = 100;
		
		if (age <= 13){
			System.out.println("You are children");
		} else if(age > 13 && age <18){
			System.out.println("You are Teenager");
		} else if (age>=60){
			if(age <=100)
			System.out.println("You are too old");
		} else {
			System.out.println("You are adult");
		}
		

	}

}

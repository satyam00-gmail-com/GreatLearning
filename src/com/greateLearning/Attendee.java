package com.greateLearning;

public class Attendee {
	
	String name;
	int age;
	char gender;
	double exp;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getExp() {
		return exp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}


	
	public Attendee(String name,int age,char gender,double exp)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.exp = exp;
		
	}

	}
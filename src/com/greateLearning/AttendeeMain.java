package com.greateLearning;

public class AttendeeMain {
	public static void main(String args[]) {
		Attendee a1 = new Attendee("Satyam", 33, 'M', 11.5);
		System.out.println("Name is:- " + a1.getName() + " Age is:- " + a1.getAge() + " Gender is :- " + a1.getGender()
				+ " exp is:- " + a1.getExp());
	}

}

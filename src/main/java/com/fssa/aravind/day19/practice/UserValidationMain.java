package com.fssa.aravind.day19.practice;


//Create a separate class UserValidator and a method UserValidator.
//validate(User user) that validate each of the attributes of the below class. 
//Please add the validation of id should be Positive, 
//name should be of minimum length 2,  
//use the Practice#4 rules for validating password, 
//use Practice#2 to validate email. Use the below User class 



public class UserValidationMain {

	public static void main(String[] args) {
		User user = new User();

		user.setId(1);
		user.setName("aravind");
		user.setEmail("aravind@gmail.com");
		user.setPassword("Aravind21");

		try {
			user.validate(user);
			System.out.println("User Id: " + user.getId());
			System.out.println("User Name: " + user.getName());
			System.out.println("User Email: " + user.getEmail());
			System.out.println("User Password: " + user.getPassword());
			System.out.println("User is valid.");
		} 
		
		catch (IllegalArgumentException e) {
			System.out.println("User validation failed: " + e.getMessage());
		}
	}

}

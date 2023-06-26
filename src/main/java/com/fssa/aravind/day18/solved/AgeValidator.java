package com.fssa.aravind.day18.solved;

//age validator class

public class AgeValidator{
	
//	validating age if age is greater than 0
//	if lesser than zero throw IllegalArgumentException
	
	static boolean validateage(int age) {
		if(age <= 0) {
			throw new IllegalArgumentException("Invalid Age");
		}
		else {
			return true;
		}
	}
	
}

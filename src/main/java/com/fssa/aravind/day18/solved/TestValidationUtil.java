package com.fssa.aravind.day18.solved;


// main class to run both postive and negative outcome
public class TestValidationUtil {
	
	public static void main(String[] args) {
		
//		positive age checker 
		positiveAgeTestcase();
		
//		Negative age checker
		negativeAgeTestCase();
		
		
		
	}
	
	
//	TestCase Methods
	
	static void positiveAgeTestcase() {
		if(AgeValidator.validateage(10)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
	}
	
	static void negativeAgeTestCase() {
			try {
				AgeValidator.validateage(-8);
				System.out.println("Test case failed");
			}
			catch (IllegalArgumentException ex) {
				System.out.println("Test case passed");
			}
	}

}


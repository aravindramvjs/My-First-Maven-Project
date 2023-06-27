package com.fssa.aravind.day18.solved;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestValidation {
	
	//	TestCase Methods
	
	@Test
	
	public void positiveAgeTestcase() {
		Assertions.assertTrue(AgeValidator.validateage(9));
	}
	
	@Test
	public void negativeAgeTestCase() {
			try {
				AgeValidator.validateage(-9);
				Assertions.fail("ValidateAge failed");
			}
			catch(IllegalArgumentException ex) {
				Assertions.assertEquals("Invalid Age", ex.getMessage());
			}
	}
	

}


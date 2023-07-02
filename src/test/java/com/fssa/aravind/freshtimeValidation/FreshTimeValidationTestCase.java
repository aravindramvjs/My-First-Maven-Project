package com.fssa.aravind.freshtimeValidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreshTimeValidationTestCase {
	
	@Test
	void testTaskName(){
		TaskValidator.taskNameValidator("Task 01");
	}
	
	@Test
	void testTaskNameException(){
		try {
			TaskValidator.taskNameValidator("Ta");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task Name should have a minimum length of 3 characters.", ex.getMessage());
		} 
	}
	
	
	@Test
	void testDuedate() {
		TaskValidator.dueDateValidator("02-Jul-2023");
	}
	
	
	@Test
	void testInvalidDueDate() {
		try {
			TaskValidator.dueDateValidator("Hello");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid Date Format", ex.getMessage());
		}
	}
	
	@Test
	void testWrongDueDate() {
		try {
			TaskValidator.dueDateValidator("01-Jul-2023");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Input date must be today or a future date.", ex.getMessage());
		}
	}
	
	
	@Test
	void testPriority() {
		TaskValidator.priorityValidator("High Priority");
	}
	
	@Test
	void testPriorityException() {
		try {
			TaskValidator.priorityValidator("No Prority");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Priority must be High priority or Mid priority or Less priority.", ex.getMessage());
		}
	}

}

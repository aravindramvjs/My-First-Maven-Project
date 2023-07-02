package com.fssa.aravind.freshtimeValidation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class Task{
	 String taskName;
	 String dueDate;
	 String priority;
	 
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
}

class TaskValidator{
	
	static void validate(Task task) throws IllegalArgumentException {
		taskNameValidator(task.getTaskName());
		dueDateValidator(task.getDueDate());
		priorityValidator(task.getPriority());
//		System.out.println("Task Valid");
	}
	
	static boolean taskNameValidator(String taskname) {
		if (taskname == null || taskname.length() < 2) {
			throw new IllegalArgumentException("Task Name should have a minimum length of 3 characters.");
		}
		else {
			return true;
		}
	}
	
	static boolean dueDateValidator(String dueDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		LocalDate now = LocalDate.now();
		String nowStr = now.format(formatter);
		LocalDate today = LocalDate.parse(nowStr, formatter);
		
		LocalDate parsedDueDate = null;
		boolean validFormat = true;
		
		try {
            parsedDueDate = LocalDate.parse(dueDate, formatter);

        } 
		catch (DateTimeParseException e) {
			validFormat = false;
        }
		
		if(!validFormat) {
			throw new IllegalArgumentException("Invalid Date Format");
		}
		else if (parsedDueDate.isBefore(today)) {
            throw new IllegalArgumentException("Input date must be today or a future date.");
        }
		else {
			return true;
		}
	}
	
	
	static boolean priorityValidator(String priority) {
		if (("high priority".equalsIgnoreCase(priority)) || ("mid priority".equalsIgnoreCase(priority)) || ("less priority".equalsIgnoreCase(priority))) {
			return true;
		}
		else {
			throw new IllegalArgumentException("Priority must be High priority or Mid priority or Less priority.");
		}
	}
}

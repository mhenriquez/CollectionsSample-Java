package edu.seminolestate.collections;

import java.util.*;

/**
 * 
 * @author Moises Henriquez
 * @date June 5, 2016
 *
 */
public class CollectionsApplication {

	public static void main(String[] args) {
		
		// Local variable
		int selection = 0;
		
		// Instantiate new scanner object
		Scanner input = new Scanner(System.in);
		
		// Instantiate new Map object
		Map<Object, String> employeeMap = new TreeMap<Object, String>();
		
		//SortedMap employeeMap = new TreeMap();
		
		do{
			// Menu with employee options
			System.out.println("Select an option from the choice below");
			System.out.println("1-Add an employee");
			System.out.println("2-Change an employee salary");
			System.out.println("3-Delete an employee");
			System.out.println("4-List an employee");
			System.out.println("5-List all employees");
			System.out.println("Enter any other number to exit");
			
			// Enter selection from menu
			String txt = input.next();
			
			// Check if 1st character entered is a digit
			if(Character.isDigit(txt.charAt(0))){
				
				// if yes, parse to integer as my choice
				selection = Integer.parseInt(txt);
				
				// check if selected digit is over 5 
				// and exit application if true
				if(selection > 5){
					System.exit(0);
				}
			}
			
			switch(selection){
				case 1:
					// Add a new employee
					Employee emp = setNewEmployee();
					
					//employeeMap.put(emp.getEmployeeId(), emp.getFirstName());
					
					break;
				case 2:
					// Update salary of employee
					
					break;
				case 3: 
					// Delete an employee
					
					break;
				case 4:
					// List an employee
					
					break;
				case 5:
					// List all employees
					
					break;
				default:
					break;
			}
			
		}while(selection < 6);
	}
	
	/*
	 * Update an employees annual salary
	 */
	public static void setNewEmployeeSalary(int id, double amt){
		throw new NotImplementedException();
	}
	
	/*
	 * List all the employees
	 */
	public static void listAllEmployees(){
		throw new NotImplementedException();
	}
	
	/*
	 * List an employee by ID
	 */
	public static void listEmployee(int id){
		throw new NotImplementedException();
	}
	
	/*
	 * Set up a new employee
	 */
	public static Employee setNewEmployee(){
		
		// Instantiate new scanner object
		Scanner input = new Scanner(System.in);
		
		// Enter ID
		System.out.println("Enter Employee ID:");
		String id = input.next();
		
		// Enter First Name
		System.out.println("Enter Employee First Name:");
		String fname = input.next();
		
		// Enter Last Name
		System.out.println("Enter Employee Last Name:");
		String lname = input.next();
		
		// Enter Annual Salary
		System.out.println("Enter Employee Annual Salary:");
		Double salary = input.nextDouble();
		
		// Create new employee object
		Employee newEmployee = new Employee(id, fname, lname, salary);
		
		return newEmployee;
	}
	
	/*
	 * Delete an employee by ID
	 */
	public static void deleteEmployee(int id){
		throw new NotImplementedException();
	}
}

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
		Employee employee;
		String employeeID;
		int selection = 0;
		
		// Instantiate new scanner object
		Scanner input = new Scanner(System.in);
		
		// Create new Sorted Map to store employee objects
		Map<String, Employee> employeeMap = new TreeMap<String, Employee>();
		
		// Create new Set from Map
		Set<Map.Entry<String, Employee>> employeeSet = employeeMap.entrySet();
		
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
					System.out.println();
					System.out.println("Good Bye");
					System.out.println();
					System.exit(0);
				}
			}
			
			switch(selection){
				case 1:
					// Create new employee object
					employee = setNewEmployee();
					
					// Add new employee if not in Map
					if(keyExists(employeeMap, employee.getEmployeeId()) == true){
						System.out.println();
						System.out.println("Fail: ID already exists.");
						System.out.println();
					} else {
						employeeMap.put(employee.getEmployeeId(), employee);
						System.out.println();
						System.out.println("Entry Successful");
						System.out.println();
					}
					break;
				case 2:
					// Update salary of employee
					
					// Enter ID
					System.out.println("Enter Employee ID:");
					employeeID = input.next();
					
					// Enter Annual Salary
					System.out.println("Enter New Annual Salary:");
					double amt = input.nextDouble();
					
					for(Map.Entry<String, Employee> entry : employeeSet){
						employee = entry.getValue();
						if(entry.getKey().equals(employeeID)){
							 employee.setAnnualSalary(amt);
						} else {
					    	 System.out.println();
					    	 System.out.println("Fail: Employee Not Found.");
					    	 System.out.println();
					    }
					}
					break;
				case 3: 
					// Delete an employee
					
					// Enter ID
					System.out.println("Enter Employee ID:");
					employeeID = input.next();
					
					for(Iterator<Map.Entry<String, Employee>> iter = employeeMap.entrySet().iterator(); iter.hasNext(); ) {
				      Map.Entry<String, Employee> entry = iter.next();
				      if(entry.getKey().equals(employeeID)){
				        iter.remove();
				        System.out.println();
						System.out.println("ID:" + employeeID + " Deleted");
						System.out.println();
				      } else {
				    	System.out.println();
				    	System.out.println("Fail: Employee Not Found.");
				    	System.out.println();
				      }
				    }
					break;
				case 4:
					// List an employee by ID
					System.out.println("Enter Employee ID:");
					employeeID = input.next();
					
					for(Map.Entry<String, Employee> entry : employeeSet){
						employee = entry.getValue();
						if(entry.getKey().equals(employeeID)){
							System.out.println("ID: " + employee.getEmployeeId()); 
							System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastNmae());
				    	    System.out.printf("Salary: $%.2f", employee.getAnnualSalary());
				    	    System.out.println();
				    	    System.out.println();
						} else {
				    	    System.out.println();
				    	    System.out.println("Fail: Employee Not Found.");
				    	    System.out.println();
						}
					}
					break;
				case 5:
					// List all employees by looping through
					// employee object and listing all the entries
					for(Map.Entry<String, Employee> entry : employeeSet){
						employee = entry.getValue();
						System.out.println("ID: " + employee.getEmployeeId());
						System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastNmae());
						System.out.printf("Salary: $%.2f", employee.getAnnualSalary());
						System.out.println();
						System.out.println();
					}
					break;
				default:
					break;
			}
		}while(selection < 6);
	}
	
	/*
	 * Check if key exists in Map and return false if not found
	 */
	public static boolean keyExists(Map<String, Employee> map, String eid){
		// Get keys from Map
		Set<String> keys = map.keySet();
		
		// Sort keys
		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		
		// Iterate through each key
		for(String key : sortedKeys){
			// If a match is found...
			if(key.equals(eid)){
				// return true
				return true;
			}
		}
		return false;
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
}

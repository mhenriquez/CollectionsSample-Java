package edu.seminolestate.collections;

/**
 * 
 * @author Moises Henriquez
 * @date June 5, 2016
 *
 */
public class Employee {
	
	//Instance variables
	private String employeeId;
	private String firstName;
	private String lastName;
	private double annualSalary;
	
	public Employee(String employeeId, String firstName, String lastName, double annualSalary){
		
	}
	
	//Employee ID
	public String getEmployeeId(){
		return employeeId;
	}
	public void setEmployeeId(String id){
		employeeId = id;
	}
	
	//First Name
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String fname){
		firstName = fname;
	}
	
	//Last Name
	public String getLastNmae(){
		return lastName;
	}
	public void setLastName(String lname){
		lastName = lname;
	}
	
	//Annual Salary
	public double getAnnualSalary(){
		return annualSalary;
	}
	public void setAnnualSalary(double salary){
		annualSalary = salary;
	}
	
	public String toString(){
		return employeeId + "\n" +
				firstName + "\n" +
				lastName + "\n" +
				annualSalary + "\n";
	}
}

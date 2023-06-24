package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

public class DriverClass {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter firstName ");
		String firstName = sc.next();
		
		System.out.println("Please enter lasttName ");
		String lastName = sc.next();
	
		Employee emp = new Employee(firstName, lastName);
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
		int option = sc.nextInt();
		
		String generatedEmail = null;
		String generatedPassword = null;
		
		ICredentials ic = new CredentialService ();  
		
		switch (option) {
		
		case 1: 
			
			generatedEmail= ic.generateEmailAddress(firstName,lastName,"Technical"); 
			generatedPassword = ic.generatePassword();
			
			break;
			
		case 2:
			generatedEmail= ic.generateEmailAddress(firstName,lastName,"Admin"); 
			generatedPassword = ic.generatePassword();
			break;
			
		case 3:
			generatedEmail= ic.generateEmailAddress(firstName,lastName,"Human Resource"); 
			generatedPassword = ic.generatePassword();
			break;
			
		case 4:
			generatedEmail= ic.generateEmailAddress(firstName,lastName,"Legal"); 
			generatedPassword = ic.generatePassword();
			break;
			
			default: 
				System.out.println("Enter a valid option");
				sc.close();
				return; }
		
			
			
		emp.setEmail(generatedEmail);
		emp.setPassword(generatedPassword);
		//emp.setFirstName(firstName);
	//	emp.setLastName(lastName);
		
		ic.showCredentials(emp);
		
		sc.close();
		
		
		
		}
		
	}



package com.greatlearning.services;


import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import java.util.Random;


public class CredentialService implements ICredentials {
	
	 public String generateEmailAddress ( String firstName, String lastName, String department) {
		 
		 return firstName+lastName+"@"+department+"gl.com";
	 }
	 public static void main(String [] args) {
		 
		// CredentialService c = new CredentialService();
		// c.generatePassword();
		// System.out.println("Generated password: " );
		 
		 
	 }
	
     public String generatePassword() {
    	 String password = "";
    	 String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	 String smallLetter = "abcdefghijklmnopqrstuvwxyz";
    	 String numbers = "0123456789";
    	 String speacialCharacters = "!\"#$%&'()*+,-./:;<=>?@[]^_`{|}~";
    	 
    	 String values = capitalLetter+smallLetter+numbers+speacialCharacters;
    	
    	 Random random= new Random();
    	 
    	
    	for (int i=0;i<8; i++) {
    		
    		int index = random.nextInt(values.length());
    		System.out.println("index :" + index);
    		char c = values.charAt(index);
    		System.out.println("pickedup character :" + c);
    		
    		password+= String.valueOf(c);
    		System.out.println("password : " + password);
    	}
    	 return password;
    	 
     }
	
	public void showCredentials (Employee emp) {
		System.out.println("");
		System.out.println("Hi : "+ emp.getFirstName()+ "" +emp.getLastName()+ ". Following are the credentials: ");
		System.out.println("Email is: "+ emp.getEmail());
		System.out.println("Password is: "+ emp.getPassword());
	}


	

}


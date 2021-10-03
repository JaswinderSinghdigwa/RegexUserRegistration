package com.bl.regex;

import java.util.Scanner;

/**
 * Purpose  - As a User need to enter a valid First Name
 * @author  - JaswinderSingh
 * @version - 16.0
 * @since   - 02-10-2021
 */
public class Regex {
	public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem");

		Registration user = new Registration();
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate E-mail Address ");
        System.out.println("Enter 4 : to validate Mobile Number ");
        System.out.println("Enter 5 : to validate Password Rule 1 ");
        System.out.println("Enter 6 : to validate Password Rule 2 ");
        System.out.println("Enter 7 : to validate Password Rule 3 ");
        System.out.println("Enter 8 : to validate Password Rule 4 ");
        int n = scanner.nextInt();
        switch (n){
        
        	case 1 :
        		user.validName();
        		break;
        	case 2 :
        		user.validLastName();
        		break;
        	case 3 :
        		user.validPhoneNumber();
        		break;
        	case 4 :
        		user.validPasswordRule1();
        		break;
        	case 5 :
        		user.validPasswordRule2();
        		break;
        	case 6 :
        		user.validPasswordRule3();
        		break;
        	case 7 :	
        		user.validPasswordRule4();
        		break;
        }
	}
}


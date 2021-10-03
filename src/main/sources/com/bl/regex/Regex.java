package com.bl.regex;

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
		user.validName();
		user.validLastName();
		user.validPhoneNumber();
		user.validPasswordRule1();
		user.validPasswordRule2();
		user.validPasswordRule3();
		user.validPasswordRule4();
	}
}


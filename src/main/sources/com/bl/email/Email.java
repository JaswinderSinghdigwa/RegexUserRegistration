package com.bl.email;

/**
 * Purpose  - We have to satisfy all the emails, we have to check enterd email is valid or not
 * @author  - JaswinderSingh
 * @version - 16.0
 * @since   - 02-09-2021
 */

public class Email{
	
public static void main(String[] args) {
    System.out.println("Welcome to Email Invalidation");
    CheckingEmailValidation email = new CheckingEmailValidation();
    email.emailVerification();
}
}
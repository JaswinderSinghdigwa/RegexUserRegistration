package com.bl.email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* code for email verfication condition */

public class CheckingEmailValidation {
		public void emailVerification() {
		Scanner scanner = new Scanner(System.in);
	    scanner = new Scanner(System.in);
	    System.out.print("Enter  Your email address :: ");
	    String email = scanner.next();
	    String regex = "^^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
	    if (matcher.matches()) {
	        System.out.println("u follow the convensation");
	    }
	    else {
	        System.out.println("u not follow th convensation");
	    }
	}
}

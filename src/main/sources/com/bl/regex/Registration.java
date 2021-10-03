package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static final Scanner scanner = new Scanner(System.in);

    public void validName(){
        System.out.print("Enter Your First Name : ");
        String firstname = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstname);
        if (matcher.matches())
            System.out.println("First name is in pattern");
        else
            System.out.println("First name is not in pattern");
    }
    

    public void validLastName(){
        System.out.println("Enter the Last Name");
        String lastname = scanner.next();

        String regex1 = "^[A-Za-z]{1}[a-z]{3,10}$";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lastname);
        if (matcher1.matches())
            System.out.println("Last name is in pattern");
        else
            System.out.println("Last name is in pattern");
    }
    
    public void validEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Email Address : ");
        String email = scanner.next();
        String regex2 = "^A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(email);
        if (matcher2.matches())
            System.out.println("Email Address is found");
        else
            System.out.println("Email Address is not found");
    }
    
}


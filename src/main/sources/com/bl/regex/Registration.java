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
            System.out.println("First name is valid");
        else
            System.out.println("First name is !Invalid");
    }
}
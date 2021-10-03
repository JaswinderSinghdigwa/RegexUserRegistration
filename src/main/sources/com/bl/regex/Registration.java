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
    
    public static void validPhoneNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String mobileno = scanner.nextLine();
        String regex3 = "^(0/91)?[7-9][0-9]{10}$";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(mobileno);
        if (matcher3.matches())
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is Invalid");
    }
    
    public static void validPasswordRule1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Password according to rule 1 : ");
        String password = scanner.nextLine();
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password);
        if (matcher4.matches())
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
    
    public static void validPasswordRule2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Password according to rule 2 : ");
        String password1 = scanner.nextLine();
        String regex5 = "^[A-Z]{1}+[a-zA-z0-9]{8,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password1);
        if (matcher5.matches())
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
    
    public static void validPasswordRule3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the PassWord");
        String passWord2 = scanner.nextLine();
        String regex6 = "^[A-Z]{1}+[0-9].{8,}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(passWord2);
        if (matcher6.matches())
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
    
    public  void validPasswordRule4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the PassWord : ");
        String passWord2 = scanner.next();
        String regex6 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(passWord2);
        if (matcher6.matches()	)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
    }
}



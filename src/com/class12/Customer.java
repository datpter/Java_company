package com.class12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    String customerCore;
    String accountNumber;
    String email;
    int ammout;


    public Customer (String customerCore,String accountNumber,String email ,int ammout){
        this.customerCore=customerCore;
        this.accountNumber=accountNumber;
        this.email=email;
        this.ammout=ammout;
    }
    public Customer(){
        customerCore= "";
        accountNumber= "";
        email = "";
        ammout = 0;
    }
    public void  inputData()throws Exception{
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{6}");
        String regex = "^(.+)@(.+)$";
        Pattern pattern1 = Pattern.compile(regex);
        try {
            System.out.println("Enter customerCore ");
            String code = sc.nextLine();
            if(code.length()!= 5){
                throw new Exception("Ban nhap loi ");
            }
            this.customerCore=code;
            System.out.println("Enter accountNumber");
            String accNumber = sc.nextLine();
            if(!accNumber.startsWith("100")){
                throw  new Exception("Bat buoc 3 so dau 100");
            }
            Matcher matcher = pattern.matcher(accNumber);
            if(!matcher.matches()) {
                throw new Exception("Account number must be 6 digits");
            }
            System.out.printf("Enter email :");
            String email = sc.nextLine();
            if(email.equals("")){
                throw new Exception("Email cua bn bi rong");
            }
            Matcher matcher1 = pattern.matcher(email);

            if (matcher.matches()){
                System.out.printf("Ban nhap dung");
            }else {
                throw new Exception("Ban nhap sai ");

            }



        }catch (Exception e){
            throw new Exception(e.getMessage());


        }
    }

}

package com.class8;

import java.util.Scanner;

public class Director extends Saff{
    private String Roll;
    private int salary;

    Director(){

    }
    Director(String roll){
        this.Roll=roll;
    }

    @Override
    public void addNewPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Director : ");
        this.Roll= input.nextLine();
        System.out.println("Enter email");
        this.email=input.nextLine();
        System.out.println("Enter name");
        this.name=input.nextLine();
        System.out.println("enter salary");
        this.salary = input.nextInt();
        super.setSalary(salary);


    }

    @Override
    public void DisplayAll() {
        System.out.println("Roll"+this.Roll);
        System.out.println("name : " +this.name);
        System.out.println("email : " +this.email);

    }

    @Override
    public void updatePerson() {

    }

    @Override
    public void updateNewSalary() {

    }

    @Override
    public void getTotalBonusOfCompany() {

    }



    @Override
    public void findPersonById() {



    }
}

package com.class8;

import java.util.Scanner;

public class Manager extends Saff {
    private String department;
    Manager(){

    }
    Manager(String department){
        this.department=department;

    }
    @Override
    public void addNewPerson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Director : ");
        this.department= input.nextLine();
        System.out.println("Enter email");
        this.email=input.nextLine();
        System.out.println("Enter name");
        this.name=input.nextLine();
        System.out.println("enter salary");
        this.salary = input.nextInt();
        super.setSalary(salary);
        System.out.println("enter salary");
        this.salary = input.nextInt();
        super.setSalary(salary);
    }

    @Override
    public void DisplayAll() {
        System.out.println("department"+this.department);
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

package com.class8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManagement {
List<Saff>list;
int currentId = 0;
public CompanyManagement(){
    list = new ArrayList<Saff>();
}
    public void addNewPerson() {
        System.out.println("1. Create a Employee ");
        System.out.println("2. Create a Director");
        System.out.println("3. Create a Manager ");
        System.out.print("Please choose: ");

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();

        Saff newSaff = null;

        switch (choose) {
            case 1: {
                newSaff = new Employee();
            }
            break;
            case 2: {
                newSaff = new Director();
            }
            break;
            case 3: {
                newSaff = new Manager();
            }
            break;
        }


        newSaff.addNewPerson();
        list.add( newSaff );
        newSaff.setId(++currentId);
        newSaff.DisplayAll();
        list.add( newSaff );
    }
    public void dislayAll() {
        for (Saff item : list) {
            //display method of Shape class
            item.DisplayAll();
        }
    }
    Saff findSaffById(){
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();

        for (Saff item : list) {
            if(findId == item.getId()) {
                item.DisplayAll();
                //return item that has id
                return item;
            }
        }

        return null;
    }
    public void updateShape() {
        Saff findShape = this.findSaffById();
        if(findShape != null) {
            findShape.updatePerson();
        } else {
            System.out.println("Not found");
        }
    }




}

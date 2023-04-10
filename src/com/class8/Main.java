package com.class8;

import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        CompanyManagement companyManagement = new CompanyManagement();

        do {
            System.out.println("1. Create a Staff");
            System.out.println("2. Display all");
            System.out.println("3. Find person by id");
            System.out.println("4. Update person");
            System.out.print("5. Exit");

            System.out.print("Choose menu: ");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();

            switch (choose) {
                case 1: {
                    companyManagement.addNewPerson();
                }
                break;
                case 2: {
                    companyManagement.dislayAll();
                }
                break;
//                case 3: {
//                    Shape s = shapeManagement.findShapeById();
//                    if( s != null) {
//                        System.out.println("Found");
//                    } else {
//                        System.out.println("Not found");
//                    }
//                }
//                break;
//                case 4: {
//                    shapeManagement.updateShape();
//                }
//                break;
                case 5: {
                    System.out.println("Close application");
                    return;
                }
            }

        } while(true);


    }
}

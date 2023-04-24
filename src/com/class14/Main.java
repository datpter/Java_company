package com.class14;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        DoctorManagement dm = new DoctorManagement();
        do {
            System.out.println("1. Add Doctor ");
            System.out.println("2.Update Doctor.");
            System.out.println("3.Delete Doctor ");
            System.out.println("4.Search Doctor. ");
            System.out.println("5.Exit. ");
            System.out.println("Choose menu");
            number = sc.nextInt();
            sc.nextLine();
            switch (number) {
                case 1: {
                    try {
                        dm.addNewDoctor();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }


                }
                break;
                case 2:{
                    try {
                        dm.updateDoctor();

                    }catch (Exception e){
                        System.out.println((e.getMessage()));
                    }

                }
                break;
                case 3:{
                    System.out.println("Nhap id bac si can xoa");
                    Integer id = sc.nextInt();
                    dm.delete(id);
                }
                break;
                case 4:{
                    Doctor s = dm.findDoctorById();
                    if( s != null) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                }
                break;


                case 5: {
                    System.out.println("Close application");
                    return;
                }
            }
        } while(true);
    }

    }


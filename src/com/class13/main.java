package com.class13;

import com.class8.Saff;

import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        FileManagement fm = new FileManagement();
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("1. Count Word In File ");
            System.out.println("2. Find File By Word ");
            System.out.println("3. Exit");
            System.out.println("Choose menu: ");
            number = sc.nextInt();
            sc.nextLine();
            switch (number) {
                case 1: {
                    System.out.println("Enter file Source ");
                    String Source = sc.nextLine();
                    File fileSource = new File(Source);
                    System.out.print("Enter word to find: ");
                    String word = sc.nextLine();
                    try {
                        int count = fm.countWord(fileSource, word);
                        if(count > 0) {
                            System.out.println(word + " found " + count + " times");
                        } else  {
                            System.out.println("Word not found");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
                case 2: {
                    System.out.println("Enter file Source ");
                    String Source = sc.nextLine();
                    System.out.print("Enter word to find: ");
                    String word = sc.nextLine();
                    File directory
                            = new File(Source);

                    try {
                        fm.getFile(directory, word);
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
                case 3: {
                    System.out.println("Close application");
                    return;
                }
            }
        } while(true);
    }

}


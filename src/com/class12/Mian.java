package com.class12;

public class Mian {
    public static void main(String[] args) {
        Customer customer = new Customer();



    while (true) {
        try {
            customer.inputData();
            break;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
        }
    }


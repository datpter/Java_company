package com.class14;

import java.util.Scanner;

public class DoctorList extends Doctor {

    @Override
    public void addNewDoctor() throws Exception {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Nhap ten : ");
            Name = input.nextLine();
            System.out.println("Nhapcode :");
            String code= input.nextLine();
            if(code.length()!=6){
                throw new Exception("code bang 6 ky tu ");
            }

           this.code= code;
            System.out.println("Nhap Khoa ");
            Specialization = input.nextLine();
            System.out.println("Trang thai ");
            Availability = input.nextInt();

        }catch (Exception e){
            throw new Exception(e.getMessage());

        }


    }

    @Override
    public void UpdateDoctor()throws Exception {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Nhap ten moi : ");
            String name = input.nextLine();
            if(name.equals("")){
                System.out.println("Ko dde rong  ");
            }
            this.Name=name;


            System.out.println("Nhap code moi ");
            String code = input.nextLine();
            if(code.equals("")){
                System.out.println("Ko dc de rong");
            }
            this.code=code;



            System.out.println("Nhap Khoa moi");
            Specialization = input.nextLine();
            System.out.println("Trang thai moi ");
            String a = input.nextLine();
            if(Integer.parseInt(a)<0){
                throw new Exception("Bna phai nhapso lon hon ko");
            } else if (Integer.parseInt(a)==0) {
                throw new Exception("Ko dc nhpa so khong");

            }

            this.Availability=Integer.parseInt(a);




        }catch (NumberFormatException e){
            throw new Exception("Ko dc nhap chu ");

        }
        catch (Exception e){
            throw  new Exception(e.getMessage());

        }


    }




    @Override
    public void display() {
        System.out.println("Ten bac si:"+Name);
        System.out.println("Code bac si"+code);
        System.out.println("Trang thai bac si"+Availability);
        System.out.println("Khoa bac si"+Specialization);

    }
}

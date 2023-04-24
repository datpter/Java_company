package com.class14;

import com.class8.Saff;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DoctorManagement {
    HashMap<Integer, Doctor> map ;
    public DoctorManagement (){
        map=new HashMap<Integer, Doctor>();
    }
    public void addNewDoctor()throws Exception{
        Doctor dt = new DoctorList();
        dt.addNewDoctor();
        map.put(dt.getId(),dt);
    }
    Doctor findDoctorById(){
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();

        for (Doctor item : map.values()) {
            if(findId == item.getId()) {
                item.display();

                //return item that has id
                return item;
            }
        }

        return null;
    }
    public void updateDoctor() throws Exception {
        Doctor findShape = this.findDoctorById();
        if(findShape != null) {
            findShape.UpdateDoctor();
        } else {
            System.out.println("Not found");
        }
    }
    public void delete (Integer id){
        this.map.remove(id).getId();

    }

}

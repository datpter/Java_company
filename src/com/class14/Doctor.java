package com.class14;

public abstract class Doctor {
    String code,Name,Specialization;
    int Availability;
    public Integer getId() {
        return new Integer(this.Availability);
    }
    public abstract void addNewDoctor() throws Exception;

    public abstract void  UpdateDoctor ()throws Exception;







    public abstract void display ();


}


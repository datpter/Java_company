package com.class8;

public abstract class Saff {
    String name , email;
    private int id;
    public int salary;

    public abstract void addNewPerson();
    public abstract void DisplayAll();
    public abstract void updatePerson();
    public abstract void updateNewSalary();
    public abstract void getTotalBonusOfCompany();
    public abstract void findPersonById(
    );
    public int setSalary(int salary){
      return   this.salary=salary;

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

}


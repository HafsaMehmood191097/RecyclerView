package com.hafsamehmood.recyclerviewlab.model;

public class student {

    String Name,RollNo;

    public student() {
    }

    public student(String name, String rollNo) {
        Name = name;
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }
}

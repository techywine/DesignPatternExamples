package org.example.stretegy;

public class Vehicle {

    DriveStretegy ds;
    public Vehicle(DriveStretegy ds){
        this.ds = ds;
    }
    public void drive(){
        ds.drive();
    }
}

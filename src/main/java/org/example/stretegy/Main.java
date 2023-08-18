package org.example.stretegy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle(new SpecialDriveStretegy());
        vehicle.drive();
    }
}

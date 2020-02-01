package com.lambton;

public class Motorcycle extends Vehicle{
    double topSpeed;
    double milage;

    public Motorcycle(long vehicleIdentificationNumber, String vehicleDescription, String manufacturerName, boolean isSelfDrive, boolean isInsured, int noOfSeat, Fuel fuelType) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName, isSelfDrive, isInsured, noOfSeat, fuelType);
    }
}

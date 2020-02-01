package com.lambton;


enum Fuel {
    Petrol,
    Diesel,
    Electric
}

enum Type {
    Car,
    Motorcycle,
    Bus
}
public abstract class Vehicle {
    String str;
    long vehicleIdentificationNumber;
    String vehicleDescription;
    String manufacturerName;
    boolean isSelfDrive;
    String Driver;
    boolean isInsured;
    String insuranceNameProvider;
    int noOfSeat;
    Fuel fuelType;
    Type vehicleType;
    int baseRate;
    int ratePerKm;
}

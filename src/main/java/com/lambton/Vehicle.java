package com.lambton;

import java.util.Scanner;
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

    public Vehicle(long vehicleIdentificationNumber, String vehicleDescription, String manufacturerName, boolean isSelfDrive,
            /*String driver,*/ boolean isInsured, /*String insuranceNameProvider,*/
                   int noOfSeat, Fuel fuelType/*, Type vehicleType, int baseRate, int ratePerKm*/) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.vehicleDescription = vehicleDescription;
        this.manufacturerName = manufacturerName;
        this.isSelfDrive = isSelfDrive;
        if(isSelfDrive==false){
            System.out.println("Enter Driver's Name: ");
            Scanner inputDriver=new Scanner(System.in);
            String driver=inputDriver.nextLine();
            this.Driver = driver;
        }
        else{
            this.Driver=null;
        }
        this.isInsured = isInsured;
        if(isInsured==true){
            System.out.println("Input Insurance Name Provider: ");
            Scanner inputInsuranceProvider= new Scanner(System.in);
            String insuranceNameProvider=inputInsuranceProvider.nextLine();
            this.insuranceNameProvider = insuranceNameProvider;
        }else{
            this.insuranceNameProvider=null;
        }

        this.noOfSeat = noOfSeat;
        this.fuelType = fuelType;
//        this.vehicleType = vehicleType;
       /* this.baseRate = baseRate;
        this.ratePerKm = ratePerKm;*/
    }
}

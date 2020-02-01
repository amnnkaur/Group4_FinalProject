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
    public Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public long getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(long vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public boolean isSelfDrive() {

        return isSelfDrive;
    }

    public void setSelfDrive(boolean selfDrive) {
        isSelfDrive = selfDrive;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    public String getInsuranceNameProvider() {
        return insuranceNameProvider;
    }

    public void setInsuranceNameProvider(String insuranceNameProvider) {
        this.insuranceNameProvider = insuranceNameProvider;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public int getBaseRate() {
        switch (vehicleType) {
            case Car:
                baseRate = 100;
                break;
            case Motorcycle:
                baseRate = 50;
                break;
            case Bus:
                baseRate = 250;
                break;
            default:
                baseRate = 0;
        }
        return baseRate;
    }

/*    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }*/

    public int getRatePerKm() {
        switch (vehicleType) {
            case Car:
                ratePerKm = 5;
                break;
            case Motorcycle:
                ratePerKm = 1;
                break;
            case Bus:
                ratePerKm = 7;
                break;
            default:
                ratePerKm = 0;
                break;
        }
        return ratePerKm;
    }
}

package com.lambton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

enum prefixers {
    CAR,
    MOT,
    BUS
}

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
    static String str;
    String prefixer;
    /*   static String key;
       static String value;
       static String hashMap;*/
    static long vehicleIdentificationNumber;
    String vehicleDescription;
    String manufacturerName;
    boolean isSelfDrive;
    String Driver;
    boolean isInsured;
    String insuranceNameProvider;
    int noOfSeat;
    Fuel fuelType;
    static Type vehicleType;
    int baseRate;
    int ratePerKm;
    static HashMap<String, String> vehicleList = new HashMap<>();

    public Vehicle(long vehicleIdentificationNumber,
                   String vehicleDescription,
                   String manufacturerName,
                   boolean isSelfDrive,
                   boolean isInsured,
                   int noOfSeat, Fuel fuelType) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
//        this.prefixer=prefixer();
        this.vehicleDescription = vehicleDescription;
        this.manufacturerName = manufacturerName;

        this.isSelfDrive = isSelfDrive;

        if (isSelfDrive == false) {
            System.out.println("Enter Driver's Name: ");
            Scanner inputDriver = new Scanner(System.in);
            String driver = inputDriver.nextLine();
            this.Driver = driver;
        } else {
            this.Driver = null;
        }

        this.isInsured = isInsured;

        if (isInsured == true) {
            System.out.println("Input Insurance Name Provider: ");
            Scanner inputInsuranceProvider = new Scanner(System.in);
            String insuranceNameProvider = inputInsuranceProvider.nextLine();
            this.insuranceNameProvider = insuranceNameProvider;
        } else {
            this.insuranceNameProvider = null;
        }

        this.noOfSeat = noOfSeat;
        this.fuelType = fuelType;

        this.vehicleList.put(String.valueOf(vehicleIdentificationNumber),
                manufacturerName);
    }

/*    public void setHashmap() {
//        this.prefixer=prefixer();
        this.vehicleList.put(String.valueOf(prefixer()),
                manufacturerName);
    }*/

    public void setVehicleList(HashMap<String, String> vehicleList) {
//        prefixer();
//        this.vehicleList.put(prefixer(),manufacturerName);
    }

    public static HashMap<String, String> getVehicleList() {
        System.out.println("Vehicle List: ");
        for (Map.Entry<String, String> entry : vehicleList.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        return null;
    }

    /*   public static String getVehicleList() {
        for(Map.Entry<String,String>entry:vehicleList.entrySet()) {
            key=entry.getKey();
            value=entry.getValue();
            hashMap=key+" - "+value;
           *//* System.out.println(entry.getKey() + " - " + entry.getValue());*//*
        }
        return hashMap;
    }*/


    public Type getVehicleType() {
        return vehicleType;
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

    public static String prefixer() {
        switch (vehicleType) {
            case Car: {
                str = new String(String.valueOf(prefixers.CAR) + "_");
                str = str.concat(String.valueOf(vehicleIdentificationNumber));
                break;
            }
            case Motorcycle: {
                str = new String(String.valueOf(prefixers.MOT) + "_");
                str = str.concat(String.valueOf(vehicleIdentificationNumber));
                break;
            }
            case Bus: {
                str = new String(String.valueOf(prefixers.BUS) + "_");
                str = str.concat(String.valueOf(vehicleIdentificationNumber));
                break;
            }
            default:
                str = null;
                break;
        }
        return str;
    }


    public void printData() {
//        setHashmap();

        System.out.println("Vehicle Identification Number: " + prefixer());
        System.out.println("Vehicle Description: " + getVehicleDescription());
        System.out.println("Manufacturer Name: " + getManufacturerName());
        System.out.println("Self Drive: " + isSelfDrive());
        System.out.println("Driver: " + getDriver());
        System.out.println("Insurance: " + isInsured());
        System.out.println("Insurance Name Provider: " + getInsuranceNameProvider());
        System.out.println("No of Seats: " + getNoOfSeat() + " seats");
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Base Rate: " + "$" + getBaseRate());
        System.out.println("Rate per km: " + "$" + getRatePerKm());
//        System.out.println("Vehicle List: "+getVehicleList());
    }


}

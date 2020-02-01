package com.lambton;
enum BusType{
    MiniBus,
    Volvo,
    DoubleDecker,
    MiniCoach
}
public class Bus extends Vehicle {


    BusType typeOfBus;
    boolean isAccessibilityServiceAvailable;
    boolean isWifiAvailable;

    public Bus(long vehicleIdentificationNumber, String vehicleDescription,
               String manufacturerName, boolean isSelfDrive,
            /*String driver,*/ boolean isInsured,
            /* String insuranceNameProvider,*/ int noOfSeat, Fuel fuelType,
               BusType typeOfBus, boolean isAccessibilityServiceAvailable,
               boolean isWifiAvailable) {
        super(vehicleIdentificationNumber, vehicleDescription,
                manufacturerName, isSelfDrive,
                /*driver,*/ isInsured,/* insuranceNameProvider,*/
                noOfSeat, fuelType);
        super.vehicleType=Type.Bus;
        this.typeOfBus=typeOfBus;
        this.isAccessibilityServiceAvailable=isAccessibilityServiceAvailable;
        this.isWifiAvailable=isWifiAvailable;
    }
}

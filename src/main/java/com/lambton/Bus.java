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

    public BusType getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(BusType typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    public boolean isAccessibilityServiceAvailable() {
        return isAccessibilityServiceAvailable;
    }

    public void setAccessibilityServiceAvailable(boolean accessibilityServiceAvailable) {
        isAccessibilityServiceAvailable = accessibilityServiceAvailable;
    }

    public boolean isWifiAvailable() {
        return isWifiAvailable;
    }

    public void setWifiAvailable(boolean wifiAvailable) {
        isWifiAvailable = wifiAvailable;
    }
    public String prefixer() {
        str = new String(String.valueOf(prefixers.BUS) + "_");
        str = str.concat(String.valueOf(vehicleIdentificationNumber));
        return str;
    }

    @Override
    public void printData() {
        System.out.println("Vehicle Identification Number: "+prefixer());
        super.printData();
        System.out.println("Bus Type: "+ getTypeOfBus());
        System.out.println("Accessibility Service Avavilable: "+isAccessibilityServiceAvailable());
        System.out.println("Wifi Available: "+isWifiAvailable());
    }

}

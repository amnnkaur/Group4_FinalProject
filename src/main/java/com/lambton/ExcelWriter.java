package com.lambton;

public class ExcelWriter {

    private static String[] columns = {"ID", "First Name", "Last Name", "Gender", "DOB", "Mobile no.", "Email",
            "User Name", "Password", "Original Password", "Address", "City"};
    private static String[] driverColumns = {"ID", "First Name", "Last Name", "Gender", "DOB", "Mobile no.", "Age", "Email",
            "User Name", "Password", "Original Password", "Licence Number", "Driving History", "Salary"};
    private static String[] ownerColumns = {"ID", "First Name", "Last Name", "Gender", "DOB", "Mobile no.", "Age", "Email",
            "User Name", "Password", "Original Password", "Company Title", "Office Contact", "Website"};
    private static String[] carColumns = {"VIN", "Vehicle Description", "Manufacturer Name", "isSelfDrive", "Driver", "isInsured",
            "Insurance Name Provider", "No. of seats", "Fuel", "Car Type", "Color", "Base Rate", "Rate per Km"};
    private static String[] motorcycleColumns = {"VIN", "Vehicle Description", "Manufacturer Name", "isSelfDrive", "Driver", "isInsured",
            "Insurance Name Provider", "No. of seats", "Fuel", "Base Rate", "Rate per Km", "Top Speed", "Mileage"};
    private static String[] busColumns = {"VIN", "Vehicle Description", "Manufacturer Name", "isSelfDrive", "Driver", "isInsured",
            "Insurance Name Provider", "No. of seats", "Fuel", "Base Rate", "Rate per Km", "Bus Type", "Accessibility", "Wifi Available"};
    private static String[] vehicleRentColumns = {"Rent Start Date", "Rent End Date", "Rented Days", "Vehicle",
            "Vehicle Type", "No.of Km Drived", "Total Bill"};

}
package com.lambton;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
    private static List<Customer> customers = new ArrayList<>();
    private static List<Driver> drivers = new ArrayList<>();
    private static List<Owner> owners = new ArrayList<>();
    private static List<Car> cars = new ArrayList<>();
    private static List<Motorcycle> motorcycles = new ArrayList<>();
    private static List<Bus> buses = new ArrayList<>();
    private static List<VehicleRent> vehiclesrents = new ArrayList<>();

    static {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1997, Calendar.NOVEMBER, 15);
        customers.add(new Customer(11514, "Anmol", "Singh", Gender.Male,
                dateOfBirth.getTime(),
                "9988421530", "me@me.com",
                "Me_AnmolSingh", "ghtutgd", "Brampton", "Toronto"));

        dateOfBirth.set(1997, Calendar.JULY, 26);
        customers.add(new Customer(11589, "Aman", "Kaur", Gender.Female,
                dateOfBirth.getTime(),
                "9547562145", "aman@aman.com",
                "Me_AmanKaur", "458954hgtfr", "New York", "USA"));

        dateOfBirth.set(1997, Calendar.JANUARY, 15);
        customers.add(new Customer(11546, "Inshant", "Tageja", Gender.Male,
                dateOfBirth.getTime(),
                "8945754621", "me_inshant@me.com",
                "Me_inshant", "inshant", "Scarbraough", "Toronto"));

        dateOfBirth.set(1997, Calendar.JUNE, 21);
        customers.add(new Customer(11575, "Monica", "Sharma", Gender.Female,
                dateOfBirth.getTime(),
                "985475412", "meMonica@me.com",
                "Me_Monica", "5485lkjhy", "Surrey", "Vancouver"));

        dateOfBirth.set(1995, Calendar.AUGUST, 01);
        customers.add(new Customer(11563, "Ikroop", "Grewal", Gender.Female,
                dateOfBirth.getTime(),
                "956482135", "me_ikroop@me.com",
                "Ikroop_Virk", "virkikroop", "New York", "USA"));

        dateOfBirth.set(1997, Calendar.MAY, 17);
        customers.add(new Customer(11557, "Kritima", " ", Gender.Female,
                dateOfBirth.getTime(),
                "8754632159", "me_kritima@me.com",
                "Me_kritima", "5475lkmnj", "Brampton", "Toronto"));
    }

    static {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1977, Calendar.NOVEMBER, 01);
        drivers.add(new Driver(11265, "Raman", "Kumar", Gender.Male, dateOfBirth.getTime(),
                "9856475452", "raman@kumar.com", "KumarShanu",
                "kjhujh", 456854, true, 5445.00f));

        dateOfBirth.set(1977, Calendar.NOVEMBER, 01);
        drivers.add(new Driver(11265, "Raman", "Kumar", Gender.Male, dateOfBirth.getTime(),
                "9856475452", "raman@kumar.com", "KumarShanu",
                "kjhujh", 456854, true, 5445.00f));

        dateOfBirth.set(1977, Calendar.NOVEMBER, 01);
        drivers.add(new Driver(11265, "Raman", "Kumar", Gender.Male, dateOfBirth.getTime(),
                "9856475452", "raman@kumar.com", "KumarShanu",
                "kjhujh", 456854, true, 5445.00f));

        dateOfBirth.set(1977, Calendar.NOVEMBER, 01);
        drivers.add(new Driver(11265, "Raman", "Kumar", Gender.Male, dateOfBirth.getTime(),
                "9856475452", "raman@kumar.com", "KumarShanu",
                "kjhujh", 456854, true, 5445.00f));

        dateOfBirth.set(1977, Calendar.NOVEMBER, 01);
        drivers.add(new Driver(11265, "Raman", "Kumar", Gender.Male, dateOfBirth.getTime(),
                "9856475452", "raman@kumar.com", "KumarShanu",
                "kjhujh", 456854, true, 540.15f));

    }

    static {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1977, Calendar.NOVEMBER, 01);
        owners.add(new Owner(111, "Caria", "MacNamee", Gender.Female, dateOfBirth.getTime(),
                "6723367", "me@me.com", "Caria", "ghat",
                "Eimbee", "2989624526", "auda.org.au", 2));

        dateOfBirth.set(1977, Calendar.NOVEMBER, 01);
        owners.add(new Owner(111, "Caria", "MacNamee", Gender.Female, dateOfBirth.getTime(),
                "6723367", "me@me.com", "Caria", "ghat",
                "Eimbee", "2989624526", "auda.org.au", 2));

        dateOfBirth.set(1977, Calendar.NOVEMBER, 01);
        owners.add(new Owner(111, "Caria", "MacNamee", Gender.Female, dateOfBirth.getTime(),
                "6723367", "me@me.com", "Caria", "ghat",
                "Eimbee", "2989624526", "auda.org.au", 2));

    }

    static {
        cars.add(new Car(11236, "New Car", "Ford",
                true, false, 4, Fuel.Electric, CarType.Sedan, "Blue"));

        cars.add(new Car(11236, "New Car", "Ford",
                true, false, 4, Fuel.Electric, CarType.Sedan, "Blue"));

        cars.add(new Car(11236, "New Car", "Ford",
                true, false, 4, Fuel.Electric, CarType.Sedan, "Blue"));

    }

    static {
        motorcycles.add(new Motorcycle(11458,"Hashtag",
                "Harley",true,false,2,Fuel.Petrol,
                56.50d,15.10d));

        motorcycles.add(new Motorcycle(11458,"Hashtag",
                "Harley",true,false,2,Fuel.Petrol,
                56.50d,15.10d));

        motorcycles.add(new Motorcycle(11458,"Hashtag",
                "Harley",true,false,2,Fuel.Petrol,
                56.50d,15.10d));

    }

}
package com.lambton;

import java.util.Date;

public class Objects {
    public static void main(String[] args) {
        Customer c1 = new Customer(10, "Anmol", "Singh", Gender.Male,
                new Date(1997, 11, 15),
                "9988421530", "me@me.com",
                "Me", "ghtutgd", "Brampton", "Toronto");
        c1.printData();

        Driver d1 = new Driver(10, "Anmol", "Singh", Gender.Male,
                new Date(1997, 11, 15),
                "9988421530", "me@me.com",
                "Me", "anmol", 15479854, true, 5245.54d);
        d1.printData();

        d1.setDrivingHistoryCleared(false);
        d1.printData();

        Owner o1 = new Owner(1, "Caria", "MacNamee", Gender.Female, new Date(1997, 05, 25),
                "6723367", "me@me.com", "Caria", "ghat",
                "Eimbee", "2989624526", "auda.org.au");

        String[] ref = new String[]{"Ford", "BMW", "Audi"};
        o1.setVehicleListOwned(ref);
        o1.printData();

        Car car1 = new Car(15498, "New Car", "Ford",
                true, false, 4, Fuel.Electric, CarType.Sedan, "Blue");
        car1.printData();
        Motorcycle m1= new Motorcycle(1548974,"Hashtag",
                "Harley",true,false,2,Fuel.Petrol,
                56.50d,15.10d);
        m1.printData();
        Bus b1=new Bus(154157,"Here only",
                "Volvo",true,false,7,Fuel.Electric,
                BusType.MiniCoach,true,true);
        b1.printData();
    }
}

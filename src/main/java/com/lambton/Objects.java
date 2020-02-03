package com.lambton;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Objects {
    public static void main(String[] args) {
        Customer c1 = new Customer(10, "Anmol", "Singh", Gender.Male,
                new Date(1997, 11, 15),
                "9988421530", "me@me.com",
                "Me", "ghtutgd", "Brampton", "Toronto");
        c1.display();

        Driver d1 = new Driver(10, "Anmol", "Singh", Gender.Male,
                new Date(1997, 11, 15),
                "9988421530", "me@me.com",
                "Me", "anmol", 15479854, true, 5245.54d);
        d1.display();

        d1.setDrivingHistoryCleared(false);
        d1.display();

        Owner o1 = new Owner(1, "Caria", "MacNamee", Gender.Female, new Date(1997, 05, 25),
                "6723367", "me@me.com", "Caria", "ghat",
                "Eimbee", "2989624526", "auda.org.au",2);

   /*     String[] ref = new String[]{"Ford", "BMW", "Audi"};
        o1.setVehicleListOwned(ref);*/
        o1.display();

        Car car1 = new Car(11236, "New Car", "Ford",
                true, false, 4, Fuel.Electric, CarType.Sedan, "Blue");
        Car car2 = new Car(11278, "New Car",
                "Ruther_Ford",
                true, false, 4, Fuel.Electric, CarType.Sedan, "Blue");
        car1.display();
        car2.display();
        Motorcycle m1= new Motorcycle(11458,"Hashtag",
                "Harley",true,false,2,Fuel.Petrol,
                56.50d,15.10d);
        m1.display();
        Bus b2=new Bus(11254,"Here only",
                "Volvo",true,false,7,Fuel.Electric,
                BusType.MiniCoach,true,true);
        Bus b1=new Bus(11245,"Here only",
                "Volv5",true,false,7,Fuel.Electric,
                BusType.MiniCoach,true,true);
        b1.display();

        b2.display();


        System.out.println(/*"Vehicle List: "+*/Vehicle.getVehicleList());
       o1.getOwnedVehicle();
//        System.out.println(/*"Vehicle List: "+*/Vehicle.getType());
        VehicleRent vr1=new VehicleRent(LocalDate.of(2020,01,15),
                LocalDate.of(2020,01,25),VehicleType.MOTORCYCLE,11458,15.25f);
        vr1.printData();
    }
}

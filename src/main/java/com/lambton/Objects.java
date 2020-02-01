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

    }
}

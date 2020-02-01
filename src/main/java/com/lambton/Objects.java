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

    }
}

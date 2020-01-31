package com.lambton;


import java.util.Date;

enum prefix {
    CUS,
    DRI,
    OWN
}

enum Gender {
    Male,
    Female,
    Other
}

abstract class Person {
    int personId;
    String firstName;
    String lastName;
    Date birthDate;
    Gender gender;
    String email;
    String address;
    String contactNumber;
    static String[] months = new String[]{"null",
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"};

}
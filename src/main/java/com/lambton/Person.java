package com.lambton;


import java.time.LocalDate;
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

    public void setData(int personId,
                        String firstName,
                        String lastName,
                        Date birthDate,
                        Gender gender,
                        String email,
                        String address,
                        String contactNumber) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;

    }

    private int getAge() {
        int age;
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();
        return age;
    }

}
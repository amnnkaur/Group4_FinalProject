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

public abstract class Person {
    int id;
    String firstName;
    String lastName;
    Gender gender;
    Date birthDate;
    int age;
    String mobileNumber;
    String emailId;
    String userName;
    char[] password;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

/*    public void setGender(Gender gender) {
        this.gender = gender;
    }*/

    public Date getBirthDate() {
        return birthDate;
    }

/*    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }*/

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
    private int getAge() {
        LocalDate today = LocalDate.now();
        this.age = today.getYear() - birthDate.getYear();
        return age;
    }

        public void setData(int id,
                        String firstName,
                        String lastName,
                        Gender gender,
                        Date birthDate,
                        String mobileNumber,
                        String emailId,
                        String userName,
                        char[] password
                        ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
            this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.password=password;

    }


  /*  public void printData() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + firstName.concat(" " + lastName));
        System.out.println("Birth Date: " + birthDate.getDate() + "/" + months[birthDate.getMonth()] + "/" + birthDate.getYear());
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Age: " + getAge() + " years");
    }*/

    public abstract void finalExecution();

}
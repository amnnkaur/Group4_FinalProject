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

public abstract class Person implements IDisplay {
    int id;
    String firstName;
    String lastName;
    Gender gender;
    Date birthDate;
    static int age;
    String mobileNumber;
    String emailId;
    String userName;
    String password;
    String providedPassword;
    String mySecurePassword;
    String salt;

    String str;
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

    public Person(int id,
                  String firstName,
                  String lastName,
                  Gender gender,
                  Date birthDate,
                  String mobileNumber,
                  String emailId,
                  String userName,
                  String password
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.userName = userName;
        this.password = password;

    }

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

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

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

    /*  public String getOriginalPassword(){
          return password;
      }*/
    public String getPassword() {
        providedPassword = password;
        salt = PasswordUtils.getSalt(30);
        mySecurePassword = PasswordUtils.generateSecurePassword(providedPassword, salt);
        return mySecurePassword;
    }

    public String getOriginalPassword() {
        VerifyProvidedPassword(providedPassword, mySecurePassword, salt);
        return password;
    }

    private static void VerifyProvidedPassword(String providedPassword, String securePassword, String salt) {
        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
        if (passwordMatch) {
            System.out.println("Provided user password " + providedPassword + " is correct.");
        } else {
            System.out.println("Provided password is incorrect");
        }
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();
        return age;
    }


    public void display() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birth Date: " + getBirthDate().getDate()+"/"+months[getBirthDate().getMonth()]+"/"+getBirthDate().getYear());
        System.out.println("Email: " + getEmailId());
        System.out.println("Mobile Number: " + getMobileNumber());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("User name: " + getUserName());
        System.out.println("Password: " + getPassword());
        System.out.println("Original password: " + getOriginalPassword());
    }


}
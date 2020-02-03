package com.lambton;

import java.util.*;

public class Owner extends Person {

    String companyTitle;
    String officeNumber;
    String website;
    List<String>vehicleListOwned = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int count;

    //     HashMap<Integer,HashMap<String,String>>ownedVehicle=new HashMap<>();
    public Owner(int id, String firstName, String lastName, Gender gender, Date birthDate,
                 String mobileNumber, String emailId, String userName, String password,
                 String companyTitle, String officeNumber, String website, int count) {
        super(id, firstName, lastName, gender, birthDate, mobileNumber, emailId, userName, password);
        this.companyTitle = companyTitle;
        this.officeNumber = officeNumber;
        this.website = website;
        this.count = count;

    }




    public void setOwnedVehicle(HashMap<Integer, HashMap<String, String>> ownedVehicle) {
//       for(int i=0;i<count;i++)
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String prefixPlacing() {
        str = new String(String.valueOf(prefix.OWN) + "_");
        str = str.concat(String.valueOf(id));
        return str;
    }

    public List<String> getVehicleListOwned() {
        String vehicle = "";

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Vehicle Name: ");
            try {
               vehicleListOwned.add(in.nextLine());

            }catch(NullPointerException e){
                System.out.println("Error");
            }
        }
/*while(in.hasNext()){
    vehicleListOwned.add(in.next());
}*/
        return vehicleListOwned;
    }

    public void setVehicleListOwned(List<String> vehicleListOwned) {
        this.vehicleListOwned = vehicleListOwned;
    }

    public void display() {
        System.out.println("Id: " + prefixPlacing());
        super.display();
        System.out.println("Company Title: " + getCompanyTitle());
        System.out.println("Business Landline Number: " + getOfficeNumber());
        System.out.println("Website: " + getWebsite());
   /*     System.out.println("Vehicles Owned: "+count);
        System.out.println("value "+ valueFromMap );*/
        getVehicleListOwned();
        for(int i=0;i<count;i++) {
            System.out.println(vehicleListOwned.get(i));
        }
        System.out.println();
    }
}

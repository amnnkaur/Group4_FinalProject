package com.lambton;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.time.LocalDate;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ExcelWriter {

    private static String[] columns = {"ID", "First Name", "Last Name", "Gender", "DOB", "Mobile no.", "Email",
            "User Name", "Password", "Original Password", "Address", "City"};
    private static String[] driverColumns = {"ID", "First Name", "Last Name", "Gender", "DOB", "Mobile no.", "Age", "Email",
            "User Name", "Password", "Original Password", "Licence Number", "Driving History", "Salary"};
    private static String[] ownerColumns = {"ID", "First Name", "Last Name", "Gender", "DOB", "Mobile no.", "Email",
            "User Name", "Password", "Original Password", "Company Title", "Office Contact", "Website","Vehicle List"};
    private static String[] carColumns = {"VIN", "Vehicle Description", "Manufacturer Name", "isSelfDrive", "Driver", "isInsured",
            "Insurance Name Provider", "No. of seats", "Fuel", "Car Type", "Color", "Base Rate", "Rate per Km"};
    private static String[] motorcycleColumns = {"VIN", "Vehicle Description", "Manufacturer Name", "isSelfDrive", "Driver", "isInsured",
            "Insurance Name Provider", "No. of seats", "Fuel", "Base Rate", "Rate per Km", "Top Speed", "Mileage"};
    private static String[] busColumns = {"VIN", "Vehicle Description", "Manufacturer Name", "isSelfDrive", "Driver", "isInsured",
            "Insurance Name Provider", "No. of seats", "Fuel", "Base Rate", "Rate per Km", "Bus Type", "Accessibility", "Wifi Available"};
    private static String[] vehicleRentColumns = {"Customer","Rent Start Date", "Rent End Date", "Rented Days", "Vehicle",
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
        dateOfBirth.set(1992, Calendar.JUNE, 28);
        customers.add(new Customer(11532, "Param", "Kaur", Gender.Female,
                dateOfBirth.getTime(),
                "8754632159", "me_kaur@me.com",
                "Me_param", "paramkaur", "Richwood", "Brampton"));

//        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1997, Calendar.NOVEMBER, 01);
        drivers.add(new Driver(12265, "Raman", "Kumar", Gender.Male, dateOfBirth.getTime(),
                "9856475452", "raman@kumar.com", "KumarShanu",
                "kjhujh", 456854, true, 5445.00f));

        dateOfBirth.set(1977, Calendar.DECEMBER, 17);
        drivers.add(new Driver(12271, "Michael", "Jordan", Gender.Male, dateOfBirth.getTime(),
                "6544875984", "micheal@jordan.com", "Jordan_Micheal",
                "dfgtre3", 854787, false, 2045.15f));

        dateOfBirth.set(2001, Calendar.FEBRUARY, 14);
        drivers.add(new Driver(12236, "Michelle", "Rai", Gender.Female, dateOfBirth.getTime(),
                "8547256318", "michelle@gmail.com", "michelle",
                "1254gytr", 169754, false, 1145.05f));

        dateOfBirth.set(1985, Calendar.AUGUST, 20);
        drivers.add(new Driver(12451, "Sherin", "Gupta", Gender.Female, dateOfBirth.getTime(),
                "98564748572", "gupSherin@yahoo.com", "SherinG",
                "524plo;", 233256, true, 998.40f));

        dateOfBirth.set(1965, Calendar.JUNE, 30);
        drivers.add(new Driver(12781, "Rakesh", "Jain", Gender.Male, dateOfBirth.getTime(),
                "9852395452", "jainbhai@gmail.com", "JainSaab",
                "ppo;;lko", 115897, true, 840.15f));

//        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1981, Calendar.SEPTEMBER, 13);
        owners.add(new Owner(13981, "Caria", "MacNamee", Gender.Female, dateOfBirth.getTime(),
                "6723367567", "me@me.com", "Caria", "ghat",
                "Eimbee", "2989624526", "auda.org.au", 2));

        dateOfBirth.set(1977, Calendar.MAY, 06);
        owners.add(new Owner(13657, "Gillingum", "Road", Gender.Male, dateOfBirth.getTime(),
                "6892145763", "gillingum@gillingum.com", "Road", "dhobi_ghat",
                "Officials", "2471596587", "officials.org.au", 5));

        dateOfBirth.set(1981, Calendar.APRIL, 01);
        owners.add(new Owner(13215, "Careem", "Nazi", Gender.Female, dateOfBirth.getTime(),
                "9988456321", "careem@me.com", "Careem", "Gaziattack",
                "DCompany", "2985421526", "ComapnyD.org.au", 3));


        cars.add(new Car("JHMZF1C67BS073397", "Mustang", "Ford",
                true, true, 2, Fuel.Diesel, CarType.Sport, "Red"));

        cars.add(new Car("5TBRU34155S423198", "G-Wagon", "Mercedes",
                false, true, 7, Fuel.Petrol, CarType.SUV, "Space-Grey"));

        motorcycles.add(new Motorcycle("1FTSW21RX8EC53647", "Davidson",
                "Harley", true, false, 2, Fuel.Petrol,
                56.50d, 36.10d));

        motorcycles.add(new Motorcycle("2HKRL1863YH598774", "BMX",
                "BMW", true, true, 2, Fuel.Petrol,
                65.00d, 32.24d));

        motorcycles.add(new Motorcycle("1J4BA6H11AL289387", "Bullet",
                "Royal Enfield", true, false, 2, Fuel.Petrol,
                70.50d, 25.10d));

        buses.add(new Bus("5LMCJ1A97FUJ59251", "Volvo",
                "BusCompany-A", false, true, 30, Fuel.Diesel,
                BusType.Volvo, true, true));

        buses.add(new Bus("1G1ZT548X5F147693", "Double_decker",
                "BusCompany-B", false, true, 70, Fuel.Diesel,
                BusType.DoubleDecker, true, false));

        buses.add(new Bus("SALFR2BG0EH387740", "Mini_coach",
                "BusCompany-C", true, false, 40, Fuel.Petrol,
                BusType.MiniCoach, true, true));


        cars.add(new Car("JTHKD5BH8D2168653", "Civic", "Hyundai",
                true, true, 5, Fuel.Electric, CarType.Sedan, "Blue"));

        vehiclesrents.add(new VehicleRent(11546,LocalDate.of(2020, 01, 15),
                LocalDate.of(2020, 01, 25), VehicleType.CAR, "JHMZF1C67BS073397", 55.18f));

        vehiclesrents.add(new VehicleRent(11563,LocalDate.of(2020, 01, 17),
                LocalDate.of(2020, 02, 20), VehicleType.BUS, "1G1ZT548X5F147693", 15.25f));

        vehiclesrents.add(new VehicleRent(11557,LocalDate.of(2020, 07, 05),
                LocalDate.of(2020, 07, 17), VehicleType.MOTORCYCLE, "2HKRL1863YH598774", 36.74f));


    }

    public static void main(String[] args) throws IOException, InvalidFormatException {

        LocalDate date = LocalDate.now();
        // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file
//        Workbook driverWorkbook = new XSSFWorkbook();

        /* CreationHelper helps us create instances of various things like DataFormat,
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();
        CreationHelper driverCreateHelper = workbook.getCreationHelper();//driver
        CreationHelper ownerCreateHelper = workbook.getCreationHelper();//owner
        CreationHelper carCreateHelper = workbook.getCreationHelper();//car
        CreationHelper motorcycleCreateHelper = workbook.getCreationHelper();//motorcycle
        CreationHelper busCreateHelper = workbook.getCreationHelper();//bus
        CreationHelper vehicleRentCreateHelper = workbook.getCreationHelper();//vehicleRent

        // Create Sheets
        Sheet sheet = workbook.createSheet("Customer");
        Sheet driversheet = workbook.createSheet("Driver");//driver
        Sheet ownersheet = workbook.createSheet("Owner");//owner
        Sheet carsheet = workbook.createSheet("Car");//car
        Sheet motorcyclesheet = workbook.createSheet("Motorcycle");//motorcycle
        Sheet bussheet = workbook.createSheet("Bus");//bus
        Sheet vehiclerentsheet = workbook.createSheet("Vehicle Rent");//Vehicle Rent
        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.BLACK.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);
        Row driverHeaderRow = driversheet.createRow(0);
        Row ownerHeaderRow = ownersheet.createRow(0);
        Row carHeaderRow = carsheet.createRow(0);
        Row motorcycleHeaderRow = motorcyclesheet.createRow(0);
        Row busHeaderRow = bussheet.createRow(0);
        Row vehicleRentHeaderRow = vehiclerentsheet.createRow(0);

        // Create cells
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }
        for (int i = 0; i < driverColumns.length; i++) {
            Cell driverCell = driverHeaderRow.createCell(i);
            driverCell.setCellValue(driverColumns[i]);
            driverCell.setCellStyle(headerCellStyle);
        }
        for (int i = 0; i < ownerColumns.length; i++) {
            Cell ownerCell = ownerHeaderRow.createCell(i);
            ownerCell.setCellValue(ownerColumns[i]);
            ownerCell.setCellStyle(headerCellStyle);
        }
        for (int i = 0; i < carColumns.length; i++) {
            Cell carCell = carHeaderRow.createCell(i);
            carCell.setCellValue(carColumns[i]);
            carCell.setCellStyle(headerCellStyle);
        }
        for (int i = 0; i < motorcycleColumns.length; i++) {
            Cell motorcycleCell = motorcycleHeaderRow.createCell(i);
            motorcycleCell.setCellValue(motorcycleColumns[i]);
            motorcycleCell.setCellStyle(headerCellStyle);
        }
        for (int i = 0; i < busColumns.length; i++) {
            Cell busCell = busHeaderRow.createCell(i);
            busCell.setCellValue(busColumns[i]);
            busCell.setCellStyle(headerCellStyle);
        }
        for (int i = 0; i < vehicleRentColumns.length; i++) {
            Cell vehiclerentCell = vehicleRentHeaderRow.createCell(i);
            vehiclerentCell.setCellValue(vehicleRentColumns[i]);
            vehiclerentCell.setCellStyle(headerCellStyle);
        }
        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        CellStyle driverDateCellStyle = workbook.createCellStyle();
        driverDateCellStyle.setDataFormat(driverCreateHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        CellStyle ownerDateCellStyle = workbook.createCellStyle();
        ownerDateCellStyle.setDataFormat(driverCreateHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        CellStyle carDateCellStyle = workbook.createCellStyle();
        carDateCellStyle.setDataFormat(driverCreateHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        CellStyle motorcycleDateCellStyle = workbook.createCellStyle();
        motorcycleDateCellStyle.setDataFormat(driverCreateHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        CellStyle busDateCellStyle = workbook.createCellStyle();
        busDateCellStyle.setDataFormat(driverCreateHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        CellStyle vehiclerentDateCellStyle = workbook.createCellStyle();
        vehiclerentDateCellStyle.setDataFormat(driverCreateHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        // Create Other rows and cells with employees data
        int rowNum = 1;
        for (Customer customer : customers) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(customer.getId());

            row.createCell(1)
                    .setCellValue(customer.getFirstName());

            row.createCell(2)
                    .setCellValue(customer.getLastName());

            row.createCell(3)
                    .setCellValue(customer.getGender().toString());

            Cell dateOfBirthCell = row.createCell(4);
            dateOfBirthCell.setCellValue(customer.getBirthDate());
            dateOfBirthCell.setCellStyle(dateCellStyle);

            row.createCell(5)
                    .setCellValue(customer.getMobileNumber());

            row.createCell(6)
                    .setCellValue(customer.getEmailId());

            row.createCell(7)
                    .setCellValue(customer.getUserName());

            row.createCell(8)
                    .setCellValue(customer.getPassword());

            row.createCell(9)
                    .setCellValue(customer.getOriginalPassword());

            row.createCell(10)
                    .setCellValue(customer.getAddress());

            row.createCell(11)
                    .setCellValue(customer.getCity());
        }

        int driverRowNum = 1;
        for (Driver driver : drivers) {
            Row row = driversheet.createRow(driverRowNum++);

            row.createCell(0)
                    .setCellValue(driver.getId());

            row.createCell(1)
                    .setCellValue(driver.getFirstName());

            row.createCell(2)
                    .setCellValue(driver.getLastName());

            row.createCell(3)
                    .setCellValue(driver.getGender().toString());

            Cell dateOfBirthCell = row.createCell(4);
            dateOfBirthCell.setCellValue(driver.getBirthDate());
            dateOfBirthCell.setCellStyle(driverDateCellStyle);

            row.createCell(5)
                    .setCellValue(driver.getMobileNumber());

            row.createCell(6)
                    .setCellValue(date.getYear() - driver.getBirthDate().getYear());

            row.createCell(7)
                    .setCellValue(driver.getEmailId());

            row.createCell(8)
                    .setCellValue(driver.getUserName());

            row.createCell(9)
                    .setCellValue(driver.getPassword());

            row.createCell(10)
                    .setCellValue(driver.getOriginalPassword());

            row.createCell(11)
                    .setCellValue(driver.getLicenceNumber());

            row.createCell(12)
                    .setCellValue(driver.isDrivingHistoryCleared());
            row.createCell(13)
                    .setCellValue("$" + driver.getSalary());
        }
        int ownerRowNum = 1;
        for (Owner owner : owners) {
            Row row = ownersheet.createRow(ownerRowNum++);

            row.createCell(0)
                    .setCellValue(owner.getId());

            row.createCell(1)
                    .setCellValue(owner.getFirstName());

            row.createCell(2)
                    .setCellValue(owner.getLastName());

            row.createCell(3)
                    .setCellValue(owner.getGender().toString());

            Cell dateOfBirthCell = row.createCell(4);
            dateOfBirthCell.setCellValue(owner.getBirthDate());
            dateOfBirthCell.setCellStyle(ownerDateCellStyle);

            row.createCell(5)
                    .setCellValue(owner.getMobileNumber());


            row.createCell(6)
                    .setCellValue(owner.getEmailId());

            row.createCell(7)
                    .setCellValue(owner.getUserName());

            row.createCell(8)
                    .setCellValue(owner.getPassword());

            row.createCell(9)
                    .setCellValue(owner.getOriginalPassword());

            row.createCell(10)
                    .setCellValue(owner.getCompanyTitle());

            row.createCell(11)
                    .setCellValue(owner.getOfficeNumber());
            row.createCell(12)
                    .setCellValue(owner.getWebsite());
           /* for(int i=0;i<owner.getCount();i++){
//                owner.getVehicleListOwned();
                row.createCell(13+i)
                    .setCellValue(owner.getVehicleListOwned().get(i));

            }*/
        }
        int carRowNum = 1;
        for (Car car : cars) {
            Row carRow = carsheet.createRow(carRowNum++);

            carRow.createCell(0)
                    .setCellValue(car.getVehicleIdentificationNumber());

            carRow.createCell(1)
                    .setCellValue(car.getVehicleDescription());

            carRow.createCell(2)
                    .setCellValue(car.getManufacturerName());

            carRow.createCell(3)
                    .setCellValue(car.isSelfDrive());

            carRow.createCell(4)
                    .setCellValue(car.getDriver());

            carRow.createCell(5)
                    .setCellValue(car.isInsured());

            carRow.createCell(6)
                    .setCellValue(car.getInsuranceNameProvider());

            carRow.createCell(7)
                    .setCellValue(car.getNoOfSeat());

            carRow.createCell(8)
                    .setCellValue(car.getFuelType().toString());

            carRow.createCell(9)
                    .setCellValue(car.getCarType().toString());

            carRow.createCell(10)
                    .setCellValue(car.getCarColor());

            carRow.createCell(11)
                    .setCellValue(car.getBaseRate());

            carRow.createCell(12)
                    .setCellValue(car.getRatePerKm());
        }
        int motorcycleRowNum = 1;
        for (Motorcycle motorcycle : motorcycles) {
            Row row = motorcyclesheet.createRow(motorcycleRowNum++);

            row.createCell(0)
                    .setCellValue(motorcycle.getVehicleIdentificationNumber());

            row.createCell(1)
                    .setCellValue(motorcycle.getVehicleDescription());

            row.createCell(2)
                    .setCellValue(motorcycle.getManufacturerName());

            row.createCell(3)
                    .setCellValue(motorcycle.isSelfDrive());

            row.createCell(4)
                    .setCellValue(motorcycle.getDriver());

            row.createCell(5)
                    .setCellValue(motorcycle.isInsured());

            row.createCell(6)
                    .setCellValue(motorcycle.getInsuranceNameProvider());

            row.createCell(7)
                    .setCellValue(motorcycle.getNoOfSeat());

            row.createCell(8)
                    .setCellValue(motorcycle.getFuelType().toString());

            row.createCell(9)
                    .setCellValue(motorcycle.getBaseRate());

            row.createCell(10)
                    .setCellValue(motorcycle.getRatePerKm());

            row.createCell(11)
                    .setCellValue(motorcycle.getTopSpeed());

            row.createCell(12)
                    .setCellValue(motorcycle.getMilage());
        }

        int busRowNum = 1;
        for (Bus bus : buses) {
            Row row = bussheet.createRow(busRowNum++);

            row.createCell(0)
                    .setCellValue(bus.getVehicleIdentificationNumber());

            row.createCell(1)
                    .setCellValue(bus.getVehicleDescription());

            row.createCell(2)
                    .setCellValue(bus.getManufacturerName());

            row.createCell(3)
                    .setCellValue(bus.isSelfDrive());

            row.createCell(4)
                    .setCellValue(bus.getDriver());

            row.createCell(5)
                    .setCellValue(bus.isInsured());

            row.createCell(6)
                    .setCellValue(bus.getInsuranceNameProvider());

            row.createCell(7)
                    .setCellValue(bus.getNoOfSeat());

            row.createCell(8)
                    .setCellValue(bus.getFuelType().toString());

            row.createCell(9)
                    .setCellValue(bus.getBaseRate());

            row.createCell(10)
                    .setCellValue(bus.getRatePerKm());

            row.createCell(11)
                    .setCellValue(bus.getTypeOfBus().toString());

            row.createCell(12)
                    .setCellValue(bus.isAccessibilityServiceAvailable());

            row.createCell(13)
                    .setCellValue(bus.isWifiAvailable());
        }
        int vehiclerentRowNum = 1;
        for (VehicleRent vehicleRent : vehiclesrents) {
            Row row = vehiclerentsheet.createRow(vehiclerentRowNum++);

            row.createCell(0)
                    .setCellValue(vehicleRent.getCustomerName());

            row.createCell(1)
                    .setCellValue(vehicleRent.getRentStartDate().toString());

            row.createCell(2)
                    .setCellValue(vehicleRent.getRentEndDate().toString());

            row.createCell(3)
                    .setCellValue(vehicleRent.getRentedDays());

            row.createCell(4)
                    .setCellValue(vehicleRent.getVehicleName());

            row.createCell(5)
                    .setCellValue(vehicleRent.getVehicleType().toString());

            row.createCell(6)
                    .setCellValue(vehicleRent.getNoOfKmDrived());

            row.createCell(7)
                    .setCellValue(vehicleRent.getTotalFare());

        }


        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }
        for (int i = 0; i < driverColumns.length; i++) {
            driversheet.autoSizeColumn(i);
        }
        for (int i = 0; i < ownerColumns.length; i++) {
            ownersheet.autoSizeColumn(i);
        }
        for (int i = 0; i < carColumns.length; i++) {
            carsheet.autoSizeColumn(i);
        }
        for (int i = 0; i < motorcycleColumns.length; i++) {
            motorcyclesheet.autoSizeColumn(i);
        }
        for (int i = 0; i < busColumns.length; i++) {
            bussheet.autoSizeColumn(i);
        }
        for (int i = 0; i < vehicleRentColumns.length; i++) {
            vehiclerentsheet.autoSizeColumn(i);
        }


        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("Car_Rental_System.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
    }
}
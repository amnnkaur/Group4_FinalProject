
import com.lambton;

enum CarType {
    Hatchback,
    Sedan,
    MPV,
    SUV,
    Crossover,
    Coupe,
    Convertible
}

public class Car extends Vehicle {

    CarType carType;
    String carColor;

    public Car(long vehicleIdentificationNumber, String vehicleDescription, String manufacturerName, boolean isSelfDrive, boolean isInsured, int noOfSeat, Fuel fuelType) {
        super(vehicleIdentificationNumber, vehicleDescription, manufacturerName, isSelfDrive, isInsured, noOfSeat, fuelType);
    }
}

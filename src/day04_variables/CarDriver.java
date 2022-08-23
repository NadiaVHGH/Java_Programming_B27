package day04_variables;

import java.sql.SQLOutput;

public class CarDriver {

    public static void main(String[] args) {

        String DriverName = "Brian";
        String CarModel = "Toyota";
        long LicenseNumber = 100_500_600_600L;
        char licenseclass = 'D';
        int Speed = 240;
        boolean IsAutomatic = true;

        System.out.println("Driver Name is " + DriverName + ".");
        System.out.println("Car Model is " + CarModel + ".");
        System.out.println("License Number is" + LicenseNumber + "." );
        System.out.println(" license class is" + licenseclass + "." );
        System.out.println("The car has range about of" + Speed + ".");
        System.out.println( "People say that " + CarModel + " car is Automatic and it is " + IsAutomatic + ".");
    }
}

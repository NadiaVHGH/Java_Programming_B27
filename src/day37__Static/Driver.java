package day37__Static;

public class Driver {
    String name;
    long licenceNumber;
    char licenseType;

    public Driver(String name, long licenceNumber, char licenseType) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.licenseType = licenseType;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNumber=" + licenceNumber +
                ", licenseType=" + licenseType +
                '}';
    }
}

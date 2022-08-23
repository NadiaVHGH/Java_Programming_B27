package day37__Static;

public class Street {
    public static void main(String[] args) {
        Car bmw = new Car("X5", "James", 31257474,'C');
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);// this is accessing instance variable
    }
    }


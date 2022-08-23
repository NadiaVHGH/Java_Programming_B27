package day37__Static.Computer;

public class Computer {
    double price ;
    String brand;
    String color;

    static boolean hasScreen ;
    static boolean hasBaterry ;
    static boolean hasMemory ;


    public Computer(double price, String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }


    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    static {
        System.out.println("Has screen " + hasScreen);
        System.out.println("Has battery " + hasBaterry);
        System.out.println("Has memory " + hasMemory);
    }

}

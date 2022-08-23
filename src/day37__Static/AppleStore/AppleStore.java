package day37__Static.AppleStore;

public class AppleStore {
    public static void main(String[] args) {
        IPhone iphone1 = new IPhone("IPhone X", "Black", 1000,256);
        System.out.println(iphone1);
        System.out.println(IPhone.brand);
        System.out.println(IPhone.os);

        //we could use object to static variables, but better to use the class name

        IPhone iphone2 = new IPhone("IPhone7", "Silver", 1000, 256);
        System.out.println(iphone2);
    }
}

package day05_arithmetic;

public class TypeCasting {

    public static void main(String[] args) {

        byte b  = 14;
        int i = (b); // int is bigger, so this is ok

        long L = 40; //by default 40 is int type, int can automatically be stored into a long because int is smaller than long
        long L2 = 30000000000L; // 300000000 is int by default, but it is too big for int type, so we need to tell the compiler it is a long type with the L

        double d = 19.99;
        int i2 = (int)d; // double is bigger than int; so I will need to cast to int
        System.out.println(i2);

        int i3 = 500;
        byte b2 = (byte)i3;
        System.out.println(b2);

        //short = 60;
       // double d13 = s;
    }
}

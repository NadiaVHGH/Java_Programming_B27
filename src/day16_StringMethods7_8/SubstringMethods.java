package day16_StringMethods7_8;

public class SubstringMethods {
    public static void main(String[] args) {

        String s = "infinity";
        //          01234567
        System.out.println(s.substring(3));
        System.out.println(s.substring(5));
        System.out.println(s.substring(7));
        System.out.println(s.substring(8));
        System.out.println("--------------------");
        System.out.println(s.substring(1,6));
        System.out.println(s.substring(3,7));
    }
}

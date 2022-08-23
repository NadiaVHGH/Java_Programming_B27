package day15_StringMethods;

public class CharMethod {
    public static void main(String[] args) {

        String s = "java";
        System.out.println("First char " + s.charAt(0));
        System.out.println("Second char " + s.charAt(1));
        System.out.println("Third char " + s.charAt(2));
        System.out.println("Fourth char  " + s.charAt(3));
        System.out.println("Length " + s.length());
        System.out.println("Last index " + 3);
        System.out.println("--------------");

        //reverse my String, hardcoded: goal is to see:avaj
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(0));
        System.out.println("" + s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0));
        System.out.println("--------------------");




    }
}

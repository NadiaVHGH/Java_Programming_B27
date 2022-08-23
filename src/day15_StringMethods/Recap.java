package day15_StringMethods;

public class Recap {
    public static void main(String[] args) {
        String first = "Testing";
        first = first.toUpperCase();//reassinging and loosing the original
        System.out.println(first);

        String second = "SOFT SKILLS";
        String lowersecond = second.toLowerCase();
        System.out.println(second);
        System.out.println(lowersecond);

        System.out.println("----------------------------");

        String third = "    hello world     ";
        System.out.println(third.length());
        third.trim();
        System.out.println(third.trim());






    }
}

package day14_StringMethods;

public class stringMethod1 {
    public static void main(String[] args) {

        String item = "pen"; // in the pool
        String item2 = new String ("pen");// directly in the heap
        System.out.println(item == item2); // checks if the object item is the same object as item2

        String item3 = new String("pen");
        System.out.println(item2 == item3);//compares the two objects. They are both in the heap
        //.(equals(): compare the value of the Strings, which checks if the characters are the same
        System.out.println(item.equals(item2));
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));
        System.out.println(item.equals("Pen"));//checks for exact character including cases
        System.out.println(item.equalsIgnoreCase("Pen"));//checks only for matching characters and ignores all the cases

        String username = "jamesbond";
        String password = "BOND007";
        System.out.println(username.equals("jamesbond"));
        System.out.println(password.equals("BOND007"));
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println("------------------------------------");

        String day = "Monday";
        System.out.println(day.length());
        String day2 = "Friday";
        int len = day2.length();
        System.out.println(len);

        String str = " Hello ";
        System.out.println(str.length());
        System.out.println("---------------------------------------");

        String word = "Summer";
        word = word.toUpperCase();
        System.out.println(word);
        System.out.println("=======================================");

        String sent = "hello My NAME is";
        System.out.println(sent.toLowerCase());



    }
}

package day7_scanners;

import java.sql.SQLOutput;

public class ShortCircuitex {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);
       // System.out.println(5/0);// we cant devide by 0

        // System.out.println(true && 5/0 == 0);
        System.out.println(false && 5/0 == 0);

        //System.out.println(false & 5/0 == 0);

        System.out.println(true || false);

        int count = 0;
        System.out.println(true || count++ == 1);
        System.out.println(count);


        int count2 = 0;
        System.out.println(count2 ++);







    }
}

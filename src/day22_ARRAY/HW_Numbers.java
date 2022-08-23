package day22_ARRAY;

import java.sql.Array;
import java.util.Arrays;

public class HW_Numbers {
    public static void main(String[] args) {
        /*
        Create an array of 5 numbers. Manually reverse the array
         */

    int [] num = new int [5];
    num[0] = 1;
    num[1] = 2;
    num[2] = 3;
    num[3] = 4;
    num[4] = 5;
        System.out.println("Numbers are: " + num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4]);
        System.out.println("Reverse: " + num[4] + " " + num[3] + " " + num[2] + " "  + num[1] + " " + num[0]);
        //System.out.println("{ " + num[0] + " , " + num[1] + " , " + num[2] + " , " + num[3] + " , " + num[4] + " }");
    }
}

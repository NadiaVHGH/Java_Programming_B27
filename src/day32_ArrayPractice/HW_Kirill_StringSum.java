package day32_ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class HW_Kirill_StringSum {
    /*String Sum
Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList( "123", "34", "513", "123456"));
        System.out.println(list);

        System.out.println(summaryString(list));

    }

    public static ArrayList<Integer>  summaryString(ArrayList<String> list) {

        ArrayList<Integer>  outList = new ArrayList<>();
        for (String each : list) {

            int sum = 0;
            for (int i = 0; i < each.length(); i++) {
                sum += Integer.parseInt(""+ each.charAt(i));
            }
            outList.add(sum);
        }
        return outList;
    }


}

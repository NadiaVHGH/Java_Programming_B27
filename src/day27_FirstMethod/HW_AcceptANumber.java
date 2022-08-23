package day27_FirstMethod;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW_AcceptANumber {
    /*create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */

    public static void defineANumber(int num){
        if(num>=1){
            System.out.println("Positive number");
        }else if(num==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative number");
        }}

    public static void main(String[] args) {
        defineANumber(-1);
    }
}
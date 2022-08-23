package day32_ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("soda","Juice", "Water", "Coffee"));

        System.out.println("Welcome. Which drink would you like?");
        String selection = input.next(); // StringUtil.fixFormat(input.next())

        if(drinks.contains(selection)){
            System.out.println(selection + " is vending");
        } else {
            System.out.println(selection + " is not in the vending machine");
        }
    }
}

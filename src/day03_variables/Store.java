package day03_variables;

public class Store {

    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems + " in the store ");

        numberOfItems = 700; // reassigned 700 into the variable
        System.out.println(numberOfItems + " after the sale ");

        int totalAfterShipment = numberOfItems + 5000;

        double totalCost = 10_000_000.99;
        /*10_000_000.99 -> how we *might want to write it, but commas are not valid java syntax, so we can use underscore in numbers, to improve readability
         */

        //soutv-shortcut for the variables
        System.out.println(totalCost);

        float f = 19.99F;
        float f2 = 100; //it also can be float f2=100F and int f2=100
        System.out.println(f);
        System.out.println(f2);

        long population = 8_000_000_000L;
        System.out.println(population);
        long pop2 = 1_000_000; //L is not needed coz 1 million is a valid number for int types, and that type can automatically be converted to a bigger type.
        System.out.println(pop2);

    }
}

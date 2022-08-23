package day02_print_statements;

public class ShoppingReceipt {

    public static void main (String [] args){
        String line1 = "******************************";
        String line2 = "______________________________";
        String line3 = "_________________________________";
        String line4 = "__";

        System.out.println();
        System.out.println(line1);
        System.out.println("\tWELCOME TO THE STORE");
        System.out.println(line1);
        System.out.println();
        System.out.println(line2);
        System.out.println("Cake\t\t\t$24");
        System.out.println("Water\t\t\t$3.99");
        System.out.println("Apple Juice\t\t$7.50");
        System.out.println("Bread\t\t\t$4.25");
        System.out.println();
        System.out.println(line2);
        System.out.println("TOTAL AMOUNT\t$39.74");
        System.out.println("TAX\t\t\t\t$3.90");
        System.out.println();
        System.out.println("GRAND TOTAL\t\t$43.64");
        System.out.println();
        System.out.println(line2);
        System.out.println("**********THANK YOU***********");
        System.out.println(line3);
        System.out.println(line3);
        System.out.println(line4);
    }
}

package day9_Statements;

public class HW_StatementsPractice4 {
    public static void main(String[] args) {
        /*
        create a sales amount variable
use the sales amount to determine the bonus you get at end of the month
	if your sales amount is less than 10000 you don't get any bonus
	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
	if your sales amount is more than or equal to 15000 you get a bonus of 7000
         */
        int salesAmount = 90_000;
        System.out.println("Sales amount: " + salesAmount);
        if(salesAmount < 10_000 || salesAmount < 0){
            System.out.println("No bonus.");
        }else if(salesAmount >= 10_000 && salesAmount < 15_000){
            System.out.println("Your bonus is: $5000");
        }else {
            System.out.println("Your bonus is: $7000");
        }
        /*
        import java.util.Scanner;

public class ifStater {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        double salesAmount = A.nextDouble();
        if(salesAmount < 10_000){
            System.out.println("No bonus");
        }
        if(salesAmount >= 10_000 && salesAmount < 15_000){
            System.out.println("$5000 bonus");
        }
        if(salesAmount >= 15_000){
            System.out.println("$7000 bonus");
        }
         */










    }
}

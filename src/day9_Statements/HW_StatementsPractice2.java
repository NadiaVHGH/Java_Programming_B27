package day9_Statements;

public class HW_StatementsPractice2 {

    public static void main(String[] args) {
        /*Create three number variables
Find and print which number is bigger between the three
        ex:
		50
		45
		100
		output:
		100 is the biggest
         */
        /*
        int creditScore = 740;
        int salary = 100_000;
        int cash = 200_000;
        //740              100_000             180_000
        if (creditScore >= 750 || salary >= 120_000 || cash >= 220_000) {
            System.out.println("you are approve for home loan");
        }
         */

        int a = 445;
        int b = 143;
        int c = 100;
        System.out.println("number is: \n" + a + "\n" + b + "\n" + c);
        if (a > b && a > c){
            System.out.println(a + " is bigger");
        }else if (b > a && b > c){
            System.out.println(b + " is bigger");
        }else {
            System.out.println(c + " is bigger");
        }
    }
}

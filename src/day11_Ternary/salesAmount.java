package day11_Ternary;

public class salesAmount {
    public static void main(String[] args) {
       /* create a sales amount variable
       use tha sales amount to determine the bonus you get at the end of the month
       if your sales amount is less than 10000 you dont get any bonus
       if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
       if your sales amount is more than or equal to 15000 you get a bonus of 7000
       print your bonus number
        */
        int sales = 10000;
        int bonus = 0;

        if (sales >= 10000 && sales < 15000){
            bonus = 5000;
        }
        if (sales >= 15000){
            bonus = 7000;
        }
        System.out.println("sales: " + sales );
        System.out.println("Bonus: " + bonus);



    }
}

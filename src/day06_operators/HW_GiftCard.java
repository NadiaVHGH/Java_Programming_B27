package day06_operators;

public class HW_GiftCard {

    public static void main(String[] args) {

        //declare and assign a gift card variable at 500
        //    declare and assign times used at 3
        //    print using giftcard and subtract 150 from the amount
        //    reduce the times used by one
        //    print using giftcard and subtract 99 from the amount
        //    reduce the time used by one
        //    print information at the end

        int giftCard = 500;
        int timesUsed = 3;
        System.out.println("Gift card amount: " + giftCard + " Times used: " + timesUsed);

        int a = 150;
        giftCard -= 150;
        System.out.println("Gift card use first time: " + "\nAmount: & " + a + "\nRemaining amount of uses: " + --timesUsed);

        int b = 99;
        giftCard -= 99;
        System.out.println("Gift card use second time: " + "\nAmount: &" + b + "\nRemaining amount of uses: " + --timesUsed);
        System.out.println("Remaining amount is &" + giftCard);

        System.out.println("---------------------------------------------------");
        /*
        double giftCard = 500;
        int uses = 3;
        System.out.println("Using giftcard. $150 removed");
        giftCard -= 150; // giftCard = giftCard - 150;
        uses--;
        System.out.println("Using giftcard. $99 removed");
        giftCard -= 99; // giftCard = giftCard - 150;
        uses--;
        System.out.println("Gift card balance left $ " + giftCard);
        System.out.println("Number of times card can be used: " + uses);

         */






    }
}

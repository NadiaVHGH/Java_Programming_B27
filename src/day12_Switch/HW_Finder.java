package day12_Switch;

import java.util.Scanner;

public class HW_Finder {
    public static void main(String[] args) {
        /*
        Season Finder
declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall
Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Season finder: ");
        System.out.println("Please  enter a number of the month you want to chose:");
        int month = input.nextInt();
        switch (month){
            case 1:
            case 12:
            case 2:
                System.out.println(month + " It's a winter time, so wear a coat, gloves and a hat ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + " Spring time, nature is awake, its time for start jogging.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + " It's Fall Season, get your water repellent clothes ready.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + " Summer time, Florida here i come , diving will be awesome on the Keys.");
                break;
            default:
                System.out.println("Invalid number, try again.");

        }














    }
}

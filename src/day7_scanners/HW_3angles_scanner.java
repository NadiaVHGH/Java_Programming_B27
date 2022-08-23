package day7_scanners;

import java.util.Scanner;

public class HW_3angles_scanner {

    public static void main(String[] args) {

        //Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
        //    Determine if the angles make a triangle, which means the angles add to 180.0
        //    and
        //    Determine if the angles make a circle, which means the angles add to 360.0

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a angle1: ");
        float angle1 = input.nextInt();
        System.out.println("Please enter a angle2: ");
        float angle2 = input.nextInt();
        System.out.println("Please enter a angle3: ");
        float angle3 = input.nextInt();

        boolean anglesMakeATriangle = (angle1 + angle2 + angle3  == 180.00);
        boolean anglesMakeACircle = (angle1+ angle2 + angle3 ==360.00);

        System.out.println("AnglesMakeATriangle " + anglesMakeATriangle);
        System.out.println("AnglesMakeACircle " + anglesMakeACircle);

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double sum = angleOne + angleTwo + angleThree;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;
         */

    }
}

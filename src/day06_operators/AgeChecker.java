package day06_operators;

public class AgeChecker {

    public static void main(String[] args) {

        int age = 12;
        boolean isChild = age < 13;
        boolean isSenior = age >=65;
        System.out.println("isChild = " + isChild);
        System.out.println("isSenior = " + isSenior);

        int currentSpeed = 45;
        int speedlimit = 50;
        boolean isSpeeding = currentSpeed > speedlimit;
        System.out.println("Is speeding: " + isSpeeding);

        int number = -4;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative);
        System.out.println("is Zero = " + isZero);

        int num = 5;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2!= 0; //num % == 1 //isEven != true





    }
}

package day06_operators;

public class HW_IsRaining {

    public static void main(String[] args) {

     boolean isRaining = false;
     int temp = 70;

     boolean shouldGoForAWalk = !isRaining && temp > 68;
        System.out.println("It is raining outside: " + isRaining);
        System.out.println("Temperature: " + temp);
        System.out.println("shouldGoForAWal: " + shouldGoForAWalk);

      /*
         declare and assign a boolean variable is raining
       declare and assign a temperature variable
       check if you should go for a walk. You should go for a walk if it is not raining and the temperature is more than 68
       */

    }
}

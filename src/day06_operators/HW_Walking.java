package day06_operators;

public class HW_Walking {

    public static void main(String[] args) {

       // declare and assign a boolean variable is raining
        //  declare and assign a temperature variable
        //  check if you should go for a walk. You should go for a walk if it is not raining and the temperature is more than 68

        boolean raining = false;
        float temp = 72;
        boolean shoulIWalk = temp > 68 && !raining;
        System.out.println("Should I walk?: " + shoulIWalk);

        //int a = 8;
        //int b = a--;
        //
        //what is a?
        //what is b?

        int a = 8;
        int b = a--;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}

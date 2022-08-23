package day06_operators;

public class HW_Casting {

    public static void main(String[] args) {

        //1.1 declare a variable of float named averageScore and initialize it to 20.5
        //1.2 declare the following variables and assign averageScore to each of them:
        //                             byte num1;
        //                             short num2;
        //                             int num3;
        //                             long num4;
        //                             float num5
        //                             double num6;


        float averageScore = 20.5f;//20.5 is double by default, we are trying to store a double to a float,


        byte num1 = (byte)averageScore;//float is bigger than byte, so we need to cast
        short num2 = (short)averageScore; //float is bigger than short, so we need to cast
        int num3 = (int)averageScore;//float is bigger than int, so we need to cast
        long num4 = (long)averageScore;
        float num5 = averageScore;//the same typr, no casting
        double num6 = averageScore;//double is bigger than float, it cast automatically

        System.out.println(num1 + "\n" + num2 + "\n" + num3 +"\n" + num4 + "\n" + num5 + "\n" + num6);



    }
}

package day10_Statements;

public class ifWithNoBrackets {
    public static void main(String[] args) {

        int score = 50;
        if (score > 70) {
            System.out.println("passing");
        } else {
            System.out.println("failing");
        }
        System.out.println("_____________________________");

        int score2 = 50;
        String result;

        if(score2 > 70){
            result = "passing";
        }else{
            result = "failing";
        }
        System.out.println(result);

        System.out.println("_____________________________");

        int score3 = 80;
        String result2 = score3 > 70 ? "passing" : "Failing";
        System.out.println(result2);
        System.out.println(score3 > 70 ? "passing" : "Failing");

        System.out.println("_____________________________");

        boolean isGreen = false;
        System.out.println(isGreen ? "Drive" : "Stop");
/*
            if(isGreen) {
                System.out.println("Drive");
            } else {
               System.out.println("Stop");
            }
         */
        System.out.println("-----------------");

        int num = 10;
        System.out.println(num > 0 ? "Positive" : num < 0 ? "Negative" : "Zero");



    }

}
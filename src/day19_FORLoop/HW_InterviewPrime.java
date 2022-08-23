package day19_FORLoop;

import java.util.Scanner;

public class HW_InterviewPrime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;
        int until = (int)Math.sqrt(number);
        for( int i = 1; i <= until; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("Its a prime number");
        }else{
            System.out.println("Its not prime number");
        }
        /*int n = 1;
        boolean isPrime = true;

        if(n < 2){
            System.out.println("Not Prime");
            System.exit(0);
        }

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");

         */




    }
}

package day9_Statements;

public class HW_StatementsPractice3 {
    public static void main(String[] args) {
        /*
        create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements
	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or 0 - 5, print: Good night
         */
        int time = 33;
        System.out.println("Time is: " + time);
        if(6 <= time && time <= 11){
            System.out.println("Good morning");

        }else if (12 <= time && time <=16){
            System.out.println("Good evening");

        }else if (24 >= time && time >= 0){
            System.out.println("Good night");
        }else {
            System.out.println("Incorrect time");
        }
        /*
        int time = 0;

        if(time >= 6 && time <= 11){
            System.out.println("Good morning");
        } else if(time >= 12 && time <= 16){
            System.out.println("Good evening");
        } else if((time >= 17 && time <= 23) || (time >= 0 && time <= 5)){
            System.out.println("Good night");
        } else {
            System.out.println("Not in 24h range");
        }
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a time from 0-23 in 24H format, where 0 is midnight");
        int time = input.nextInt();
        String message = ""; // declaring and assigning a String with value empty space "". Default starting value

        if(time >= 6 && time <= 11){
            message = "Good morning";
        } else if(time >= 12 && time <= 16){
            message = "Good evening";
        } else if((time >= 17 && time <= 23) || (time >= 0 && time <= 5)){
            message = "Good night";
        } else {
            message = "Not in 24h range";
        }

        System.out.println(message);

         */















    }
}

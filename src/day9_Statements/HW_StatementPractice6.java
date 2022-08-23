package day9_Statements;

public class HW_StatementPractice6 {
    public static void main(String[] args) {
        /*
        create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number
	Ex:
		2
		Tuesday
	Ex:
		5
		Friday
         */
    int representDay = 0;
    if(representDay == 1){
        System.out.println("Number: " + representDay + "\nMonday");
    }else if(representDay ==2){
        System.out.println("Number: " + representDay + "\nTuesday");
    }else if(representDay == 3){
        System.out.println("Number: " + representDay + "\nWednesgay");
    }else if(representDay == 4){
        System.out.println("Number: " + representDay + "\nThuersday");
    }else if(representDay == 5){
        System.out.println("number: " + representDay + "\nFriday");
    }else if(representDay == 6){
        System.out.println("Number: " + representDay + "\nSaturday");
    }else if(representDay == 7){
        System.out.println("Number: " + representDay + "\nSunday");
    }else{
        System.out.println("Wrong number, please use number from 1 to 7");
    }

    }
}

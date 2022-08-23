package day28_Methods;

public class HW_3 {
    public static void main(String[] args){
        System.out.println();
        /*
        Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James
         */
    }
    public static String properFormat(String str){
        str = str.toLowerCase();
        return str.substring(1,1).toUpperCase()+str.substring(1).toLowerCase();
    }
}

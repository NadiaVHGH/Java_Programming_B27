package day28_Methods;

public class HW_Palindrome {
    /*
    create a method that will that will accept a String and find if it is Palindrome or not (boolean)
     */
    public static void main(String[] args) {
        System.out.println(isOrIsntPalindrome("racecar"));


    }
    public static boolean isOrIsntPalindrome(String str){
        String reverseStr = "";
        for (int i = str.length()-1; i >-1; i--) { //i>=0 (its the same)
            reverseStr += str.charAt(i);
        }
        return(reverseStr.equalsIgnoreCase(str));
    }
}

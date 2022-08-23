package day16_StringMethods7_8;

public class HW_Email {
    public static void main(String[] args) {
        /*Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.

    input:
        JamesBond
        012345678
        Secret
        012345
    output:
        jameret@cydeo.com
         */
        String word1 = "JamesBond";
        String word2 = "Secret";
        if(word1.length() >= 6 && word2.length() >= 6){
            word1 = word1.substring(0,4).toLowerCase();
            word2 = word2.substring(3,6).toLowerCase();
            System.out.println(word1 +word2 + "@cydeo.com");

        }else{
            System.out.println("Invalid data");
        }







    }
}

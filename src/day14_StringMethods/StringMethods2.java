package day14_StringMethods;

import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args) {

       /*
       Declare and assign a String
print the String in all uppercase format and
print the String in all lowercase format

-----------------------------------------------------------

Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password

-----------------------------------------------------------

Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters



      String study = "We are studing JAVA.";
      study =  study.toUpperCase();
      System.out.println(study);

      String study2 = "We are studing JAVA.";
        System.out.println(study2.toLowerCase());



        System.out.println("---------------------------------");


        Scanner scan = new Scanner(System.in);
        String password = "";
        System.out.println("Please enter ur password ");
        password = scan.next();
        if(password.length()>=8){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }

        System.out.println("_______________________________________");
*/

        Scanner scan = new Scanner(System.in);
        String words = "";
        System.out.println("please type the words");
        words = scan.nextLine();
        System.out.println(words.trim());
        System.out.println(words.toLowerCase());
        System.out.println();
        System.out.println(words.length());

































    }
}

package day19_FORLoop;

import java.util.Scanner;

public class HW_Space {
    public static void main(String[] args) {

        /*Space program

        Given a String return a version of with spaces between all of the letters.
                If there is already a space in the String put an underscore

        Ex: java	-> j a v a
        space 	-> s p a c e
        more words -> m o r e _ w o r d s*/

        String s = "mama mama";
        String result = "";

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);

            if(letter == ' '){
                result += "_ "; //concatenating
            }else{
                result +=letter + " ";
            }
        }
        System.out.println(result.trim());
    }
}

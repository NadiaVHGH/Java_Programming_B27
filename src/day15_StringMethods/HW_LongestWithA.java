package day15_StringMethods;

public class HW_LongestWithA {
    public static void main(String[] args) {

         /* create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'
	Ex:
		"java"
		"mouse"
		"computer"
	Output: java
Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
         */

        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        int word1len = word1.length();
        int word2len = word2.length();
        int word3len = word3.length();
        String longest = "";

         if(word1.contains("a") && word1.length() > longest.length()) {
             longest = word1;
         }
         if(word2.contains("a") && word2.length() > longest.length()){
             longest = word2;
         }
         if(word3.contains("a") && word3.length() > longest.length()){
             longest = word3;
         }
        System.out.println(longest + " is the longest");




    }

}

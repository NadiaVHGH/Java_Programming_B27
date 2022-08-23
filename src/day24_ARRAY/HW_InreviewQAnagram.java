package day24_ARRAY;

import java.util.Arrays;

public class HW_InreviewQAnagram {
    public static void main(String[] args) {

        /*[IQ] Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
Ex:
  listen
  silent

The letters of the two words are the same so they are anagram

         */
        /*String word1 = "listen";
        String word2 = "silent";
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) { //every char
                count++;
            }
        }
        if (count == array2.length) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }*/
        String word1 = "listen";
        String word2 = "silent";

        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        if(Arrays.equals(first, second)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        System.out.println(Arrays.equals(first, second) ? "Anagram" : "Not Anagram");
    }}


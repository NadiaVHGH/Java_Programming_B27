package day20_ForLoop;

public class HW_Dublicates {
    public static void main(String[] args) {
        /*Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc*/

        String word = "abcabc";
        String dublicates = "";
        String a = "";

        for(int i = 0; i <word.length(); i++ ){
            if(word.charAt(i) == 'a' && word.charAt(i + 1) == 'b' && word.charAt(i+2) == 'c'){
            }
        }
        System.out.println(dublicates);

    }
}

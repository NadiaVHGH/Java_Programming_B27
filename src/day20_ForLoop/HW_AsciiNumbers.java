package day20_ForLoop;

public class HW_AsciiNumbers {
    public static void main(String[] args) {
        /*
        Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97

         */

        String word = "java";
        char result = 0;

        for(int i = 0; i < word.length(); i++){
            result = word.charAt(i);

            System.out.print(result + " ");
            System.out.println(result + 0);
        }


    }
}

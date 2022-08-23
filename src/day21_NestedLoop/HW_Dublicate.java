package day21_NestedLoop;

public class HW_Dublicate {
    public static void main(String[] args) {
/*[IQ] Duplicate characters

        Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

        Ex:
        Input:
        "AAABCCDEEF"
        Output:
        ACE

                -> the characters A C and E are found in the String multiple times so they are duplicates

        variations:
        Write a program that can return the first duplicated character from a string
 */
        String str = "AAABCCDEEF";
        String duplicate = "";
        String count = "";

        for (int i = 0; i < str.length(); i++) {

            if (count.contains(""+ str.charAt(i))){

                if (!duplicate.contains(""+ str.charAt(i))){
                    duplicate += str.charAt(i);

                }
            }
            count += str.charAt(i);
        }
        System.out.println(duplicate);
    }
}



package day29_Methods;

public class FrequencyOfCharacter {
    /* given a String and char determine how many times the given char is found in the String
    "java"
    a
    >2
     */
    public static  int FrequencyOfChar(String str, char letter){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) ==letter){
             count++;
           }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(FrequencyOfChar("java",'a'));
        System.out.println(FrequencyOfChar("apple",'a'));
        System.out.println(FrequencyOfChar("apple",'p'));
        System.out.println(FrequencyOfChar("mississippi",'i'));
        System.out.println(FrequencyOfChar("mississippi",'s'));
    }
}

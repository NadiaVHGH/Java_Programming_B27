package day16_StringMethods7_8;

public class FunLanguage {
    public static void main(String[] args) {
        /*Given a sentence. Display the sentence with the first word moved to the end of the sentence.
    Input:
        Java is a fun language
    Output:
        is a fun language Java
         */

        String sent = "Java is a fun language";
        String firstword = sent.substring(0,4);
        String sentWithoutJava = sent.substring(5);
        System.out.println(sentWithoutJava + " " + firstword);




    }
}

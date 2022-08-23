package day21_NestedLoop;

public class FrequencyOfCharacters_Interview_QA {
    public static void main(String[] args) {

        /*
        given a string determine how many times a character is in the String java
        java
                       j            a           v
        j - 1       j==j        a==j        v==j
        a - 2       j==a        a==a        v==a
        v - 1       j==v        a==v        v==v
                    j==a        a==a        v==a

         */

        String str = "hello world java";
        String checked = "";

        for (int i = 0; i < str.length(); i++) { // outer: iterating one character at a time --> charAt(i)

            int count = 0; // the counter should reset back to 0 for every character

            if (!checked.contains("" + str.charAt(i))) { // only run the counting and inner loop if the character has not already been checked
                for (int j = 0; j < str.length(); j++) { // inner: compare the character we are looking at( i ) with each other character in the String --> str.charAt(j)

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }

                } // inner loop ends

                System.out.println(str.charAt(i) + " - " + count);
                checked += str.charAt(i); // adds to the checked String
            } // if statement ends
        } // outer loop ends




/*
        String str = "java";
        String checked = "";

        for(int i = 0; i < str.length(); i++){ // outer: iterating one character at a time --> charAt(i)

            int count = 0; // the counter should reset back to 0 for every character

            if(checked.contains("" + str.charAt(i))){
                continue;
            }

            for(int j = 0; j < str.length(); j++){ // inner: compare the character we are looking at( i ) with each other character in the String --> str.charAt(j)

                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }

            System.out.println(str.charAt(i) + " - " + count);
            checked += str.charAt(i);

        }
 */

    }
}

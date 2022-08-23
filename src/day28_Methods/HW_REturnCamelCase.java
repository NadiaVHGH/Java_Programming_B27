package day28_Methods;

public class HW_REturnCamelCase {
    /*
Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase
Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld
     */

    public static void main(String[] args) {
        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));
    }

    public static String camelCase(String str) {
        String result = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                result += str.toUpperCase().substring(i + 1, i + 2);
                i++;
            } else {
                result += str.charAt(i);
            }

        }
        return result;
    }
}




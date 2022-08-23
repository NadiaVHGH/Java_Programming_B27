package day17_StringMethods7_11;

public class Replace {
    public static void main(String[] args) {

        String str = "java";
        str = str.replace('a','z');
        System.out.println(str);

        String str2 = "an apple path";
        System.out.println(str2.replace("a","(a)"));

        String str3 = "    multiple words here     ";
        str3 = str3.replace(" ", "");
        System.out.println(str3);

        String z = "wooden spoon";
        System.out.println(z.replace("o", "-"));
        System.out.println(z.replaceFirst("o", "-"));

        String ex = "wooden spoon";
        int firstO = ex.indexOf('o');
        int secondO = ex.indexOf('o', firstO + 1);
        System.out.println(ex.substring(0, secondO));
        System.out.println(ex.substring(secondO).replaceFirst("o", "-"));
        System.out.println(ex.substring(0, secondO) + ex.substring(secondO).replaceFirst("o", "-"));


    }
}

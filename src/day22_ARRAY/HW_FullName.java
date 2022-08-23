package day22_ARRAY;

public class HW_FullName {
    public static void main(String[] args) {

        /*
        Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS
        No loop yet
         */
        String[]name = {"James Bonds", "Harry Potter", "Tony Stark"};
        System.out.println("" + name[0].charAt(0) + name[0].charAt(name[0].indexOf(" ") + 1));
        System.out.println("" + name[1].charAt(0) + name[1].charAt(name[0].indexOf(" ") + 1));
        System.out.println("" + name[2].charAt(0) + name[2].charAt(name[0].indexOf(" ")));




    }
}

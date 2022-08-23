package day21_NestedLoop;

public class cgjsr {
    public static void main(String[] args) {
        String name =" chack norris ";
        name = name.toUpperCase().trim();
        name = name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1) + ".";
        System.out.println(name);

    }
}

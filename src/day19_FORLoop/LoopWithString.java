package day19_FORLoop;

public class LoopWithString {
    public static void main(String[] args) {

        String s = "july";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}

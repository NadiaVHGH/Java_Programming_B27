package day27_FirstMethod;

public class HW_CharCases {
    /*
   Character Methods
   Print each one in one line
   - make method that will print all the letters from A to Z
   - make method that will print all the letters from a to z
   - make method that will print all the letters from Z to A
   - make method that will print all the letters from z to a
   - make method that will print all the letters from 0 to 9
    */
    public static void letterUpperAZ(){

        for(char i ='A'; i <= 'Z';  i++){
            System.out.print(i +" ");
        }

    }
    public static void letterLowerAZ(){
        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
    }

    public static void reverseUpperAZ(){
        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }
    }

    public static void reverseLowerAZ(){
        for(char i = 'z'; i >= 'a'; i--){
            System.out.print(i + " ");
        }
    }

    public static void number(){
        for(int i = 0; i <= 9; i++){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        letterUpperAZ();
        System.out.println();
        letterLowerAZ();
        System.out.println();
        reverseLowerAZ();
        System.out.println();
        reverseUpperAZ();
        System.out.println();
        number();
    }
}

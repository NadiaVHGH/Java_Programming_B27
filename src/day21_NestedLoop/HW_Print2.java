package day21_NestedLoop;

public class HW_Print2 {
    public static void main(String[] args) {
        /*
        Print this shape:

    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
         */
        for (int i = 0; i < 9; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

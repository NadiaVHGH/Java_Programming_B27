package day18_WhileLoop7_12;

public class DoWhileExample {
    public static void main(String[] args) {
         int i = 0;

        do {
            System.out.println(i);
        }while(false);//the do block is execute first, then the boolean  is checked

        do{
            System.out.println(i);
            i++;
        }while(i <= 10);


    }
}

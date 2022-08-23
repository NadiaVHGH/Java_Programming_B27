package day18_WhileLoop7_12;

public class EvenAndOdd {
    public static void main(String[] args) {

        int limit = 100;
        int count = 1;

        while (count <= limit){

            if(count % 2 == 0){ //runs even numbers
                System.out.print(count + " ");
            }
                count++;
        }
        System.out.println();

        int back = limit;
        while(back >= 1){
            if(back % 2 == 1){ //runs odd numbers
                System.out.print(back + " ");
            }
            back--;

        }


    }
}

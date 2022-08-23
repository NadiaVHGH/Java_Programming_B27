package day10_Statements;

import java.util.Scanner;

public class HW_Language {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number assigned to the language you prefer");
        System.out.println("1 - English\n2 - Spanish\n3 - Turkish\n4 - Russian\n5 - French");
        int input = scan.nextInt();

        if (input == 1){
            System.out.println("hello, thank for your call");
        } else if (input == 2){
            System.out.println("hola, gracias para llamar");
        } else if (input == 3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (input == 4){
            System.out.println("privet, spasibo za vash zvonok");
        } else if (input == 5){
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("Invalid Number");
        }
    }
}

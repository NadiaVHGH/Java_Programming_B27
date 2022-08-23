package day20_ForLoop;

public class Loop {
    public static void main(String[] args) {

        for(int i= 1; i <=5; i++){
            System.out.println(i + " ");
        }
        System.out.println();

        for(int i= 1; i <=5; i++){
            if(i == 2){
                continue;
            }
            System.out.println(i + " ");
        }
        System.out.println();
        for(int i = 1; i < 100; i++){
            if(i% 2 == 0){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}

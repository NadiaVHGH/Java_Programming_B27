package day23_ArrayPractice;

public class Average {
    public static void main(String[] args) {
        //For each loop
        double [] prices ={13.99,19.14,3.112,65.332};
        double sum = 0;
        for(double eachprice : prices){
            sum += eachprice;
        }
        System.out.println(sum / prices.length);

        //For Loop
        //        double sum = 0;
//        for(int i = 0; i < prices.length; i++){
//            sum += prices[i];
//        }
//        System.out.println(sum / prices.length);


        // eachPrice == prices[i] --> same


    }
}

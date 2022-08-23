package day30_Practice_Wrapper;

public class HW_SaimMinMaxx {
     /*
        Group of utility methods for arrays
        Extra practices from 08/01 will be done here
     */

    /*
    Min Number
        create a method that will accept an int array and return the smallest number from the array
    */

    public static int min(int [] arr){// int []arr is the same as int ... arr
        int min = arr[0];

        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    /*
    Max Number

    create a method that will accept an int array and return the biggest number from the array
     */
    public static int max(int [] arr){
        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

}

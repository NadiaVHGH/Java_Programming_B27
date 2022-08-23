package day16_StringMethods7_8;

public class DynamicIndexOf {
    public static void main(String[] args) {
        /*String str = "definition";
        //mississippi


        System.out.println("First i: " + str.indexOf('i'));
        System.out.println("Second i: " + str.lastIndexOf('i', 4));
        System.out.println("Third i: " + str.lastIndexOf('i', 6));

        System.out.println("Hard coded above ----------------- Dynamic below");*/

        String str = "mississippi";
        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i',firstI + 1);//take previously index and add 1 to it, so we can start looking for the occurrence
        int thirdI = str.indexOf('i',secondI + 1);

        System.out.println("First i: " + firstI);
        System.out.println("Second i: " + secondI);
        System.out.println("Third i: " + thirdI);



    }
}

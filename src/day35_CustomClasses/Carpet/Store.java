package day35_CustomClasses.Carpet;

import day35_CustomClasses.Carpet.Carpet;

public class Store {
    public static void main(String[] args) {
       Carpet cover = new Carpet(12.5,35, 12.99, false);
        System.out.println(cover);
        Carpet persian = new Carpet(12.5,35,12.99, true);
        System.out.println(persian);

    }
}

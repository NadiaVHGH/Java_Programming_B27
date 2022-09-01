package day40_Inheritance;

public class Parent {
    public static void Hello(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent{
    public static void Hello(){
        System.out.println("Hello from Child");
    }
}


class Run{
    public static void main(String[] args) {
        Parent.Hello();
        Child.Hello();
    }
}

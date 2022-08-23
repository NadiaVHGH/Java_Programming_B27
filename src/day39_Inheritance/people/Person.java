package day39_Inheritance.people;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        // super() -> calls the parent constructor
        this.name = name;
        this.age = age;
    }
}

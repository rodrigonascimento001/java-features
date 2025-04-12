package br.com.core.rmmapp.features.java16;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person.name()); // Alice
        System.out.println(person.age());  // 30
        System.out.println(person);        // Person[name=Alice, age=30]
    }
}
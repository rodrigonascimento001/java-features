package br.com.core.rmmapp.features.java14;

public class RecordExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        System.out.println(person.name()); // Alice
        System.out.println(person.age());  // 25
        System.out.println(person);        // Person[name=Alice, age=25]
    }
}
package br.com.core.rmmapp.features.java15;

public class RecordsExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Nome: " + person.name());
        System.out.println("Idade: " + person.age());
        System.out.println("toString: " + person);
    }
}
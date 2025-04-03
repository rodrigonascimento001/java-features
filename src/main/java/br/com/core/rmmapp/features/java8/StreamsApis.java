package br.com.core.rmmapp.features.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApis {
    public static void main(String[] args) {
        //Processamento funcional de coleções.
        List<String> names = Arrays.asList("Rodrigo", "Mayra", "Mariana");
        System.out.println("Names filter startsWith M:");
        names.stream().filter(name -> name.startsWith("M")).forEach(System.out::println);

        System.out.println("Names filter endsWith igo:");
        names.stream().filter(name -> name.endsWith("igo")).forEach(System.out::println);

        System.out.println("Names filter contains y:");
        names.stream().filter(name -> name.contains("y")).forEach(System.out::println);

        System.out.println("Names filter equals Mariana:");
        names.stream().filter(name -> name.equals("Mariana")).forEach(System.out::println);

        System.out.println("Names filter equals Mariana: count ");
        System.out.println(names.stream().filter(name -> name.equals("Mariana")).count());

        System.out.println("joining() Returns a Collector that concatenates the input elements into a String, in encounter order. ");
        String concatenateResponse = names.stream().filter(name -> name.startsWith("M")).collect(Collectors.joining());
        System.out.println(concatenateResponse);

        System.out.println("stream().noneMatch");
        System.out.println(names.stream().noneMatch(name -> name.startsWith("m")));

        System.out.println("stream().anyMatch");
        System.out.println(names.stream().anyMatch(name -> name.startsWith("M")));

        System.out.println("stream().allMatch");
        System.out.println(names.stream().allMatch(name -> name.equals("Mariana2")));

        System.out.println("stream().count");
        System.out.println(names.stream().count());

        System.out.println("stream().collect to List");
        System.out.println(names.stream().distinct().collect(Collectors.toList()));

        System.out.println("stream()  findAny");
        System.out.println(names.stream().findAny());

        System.out.println("stream() findFirst");
        System.out.println(names.stream().findFirst());

        System.out.println("stream().sorted");
        System.out.println(names.stream().sorted().collect(Collectors.toList()));

        System.out.println("stream().distinct");
        System.out.println(names.stream().distinct().collect(Collectors.toList()));

        System.out.println("stream().limit");
        System.out.println(names.stream().limit(2).collect(Collectors.toList()));
    }
}

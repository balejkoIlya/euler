package com.example.streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "pear", "banana", "kiwi", "orange", "grape");
        String maxLengthStr = strings.stream()
                .max((s1, s2) -> s1.length() - s2.length()).get();

        System.out.println(maxLengthStr);

        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Jane", 35),
                new Person("Jack", 40),
                new Person("Anna", 28),
                new Person("Mike", 32)
        );

        List<String> names = people.stream()
                .filter(person -> person.getAge() > 30)
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(names);

        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 100.50, "DEBIT"),
                new Transaction(2, 200.00, "CREDIT"),
                new Transaction(3, 50.75, "DEBIT"),
                new Transaction(4, 300.00, "CREDIT"),
                new Transaction(5, 120.00, "DEBIT")
        );

        double sum = transactions.stream()
                .filter(t -> t.getType().equals("DEBIT"))
                .mapToDouble(t -> t.getAmount())
                .sum();
        System.out.println(sum);

    }
}

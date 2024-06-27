package com.example.streamtest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 2, 4, 5, 7, 8, 16, 12, 11, 9);
        List<Integer> list2 = list.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list2);
        List<String> strings = List.of("hello", "ok", "java", "mouse", "lol");
        List<String> result = strings.stream()
                .filter(s -> s.length() > 3)
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);

        List<Employee> employees = List.of(new Employee("Oleg", "Java"),
                new Employee("Ilya", "Java"),
                new Employee("Alex", "Python"),
                new Employee("Kirill", "Python"),
                new Employee("Sanya", "JS"));
        Map<String, List<Employee>> groupResult = employees
                .stream()
                .collect(Collectors.groupingBy(e -> e.getDeportament()));
        for (Map.Entry<String, List<Employee>> pair : groupResult.entrySet()) {
            System.out.println(pair.getKey() + ":" + pair.getValue());

        }
    }
}

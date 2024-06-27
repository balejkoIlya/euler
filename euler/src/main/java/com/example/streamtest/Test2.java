package com.example.streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<String> list=List.of("String","Name","test","api","class","equals","comparator");
        String result=list.stream()
                .sorted((s1,s2)->s1.length()-s2.length())
                .limit(3)
                .collect(Collectors.joining(","));
        System.out.println(result);

        List<Integer> list2=List.of(1,2,3,4,5,6,7,8,9,10);
        int sumOfSquares=list2.stream()
                .filter(i->i%2!=0)
                .reduce((a,e)->a+e*e).get();
        System.out.println(sumOfSquares);

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana", "kiwi");
        Map<String,Long> map=words.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        for(Map.Entry<String,Long> pair:map.entrySet()){
            System.out.println(pair.getKey()+":"+pair.getValue());
        }

        List<String> stringList2 = Arrays.asList("apple", "banana", "kiwi");
        List<String> stringList1 = Arrays.asList("banana", "orange", "kiwi", "grape");
        Stream<String> stringStream=Stream.concat(stringList1.stream(),stringList2.stream());
        List<String> stringList=stringStream.sorted().distinct().collect(Collectors.toList());
        System.out.println(stringList);
    }
}

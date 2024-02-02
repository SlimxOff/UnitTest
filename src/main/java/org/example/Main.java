package org.example;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Создание ArrayList с данными
        List<Integer> numbers = List.of( 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Отфильтровать положительные числа
        List<Integer> positiveNumbers = new ArrayList<>();
        for(int num : numbers){
            if(num > 0 && num %2 ==0){
                positiveNumbers.add(num);
            }
        }

        // Вывести результат
        Collections.sort(positiveNumbers);
        System.out.println(positiveNumbers);
    }

}

class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}

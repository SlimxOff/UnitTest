package org.example;

import java.util.*;
import java.util.stream.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание ArrayList с данными
        List<Integer> numbers = List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Получение отфильтрованных положительных четных чисел
        List<Integer> positiveEvenNumbers = filterPositiveEvenNumbers(numbers);

        // Вывести результат
        Collections.sort(positiveEvenNumbers);
        System.out.println(positiveEvenNumbers);
    }

    public static List<Integer> filterPositiveEvenNumbers(List<Integer> numbers) {
        List<Integer> positiveEvenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num > 0 && num % 2 == 0) {
                positiveEvenNumbers.add(num);
            }
        }
        return positiveEvenNumbers;
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

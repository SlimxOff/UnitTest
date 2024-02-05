package org.example;

import org.example.Main;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    @Test
    void testFilterPositiveEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = Main.filterPositiveEvenNumbers(numbers);

        // Ожидаемые результаты после фильтрации и сортировки
        List<Integer> expected = List.of(2, 4, 8, 16, 32);
        Collections.sort(result);
        // Проверяем, совпадают ли ожидаемые и фактические результаты
        assertEquals(expected, result);
    }

    @Test
    void testFilterPositiveEvenNumbersEmptyList() {
        List<Integer> numbers = List.of(-1, -3, -5, -7);
        List<Integer> result = Main.filterPositiveEvenNumbers(numbers);

        // Ожидаемый результат - пустой список, так как нет положительных четных чисел
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterPositiveEvenNumbersNoEvenNumbers() {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        List<Integer> result = Main.filterPositiveEvenNumbers(numbers);

        // Ожидаемый результат - пустой список, так как нет четных чисел
        assertTrue(result.isEmpty());
    }
}

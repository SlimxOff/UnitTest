import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testPositiveEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> expected = numbers.stream()
                .filter(x -> x > 0 && x % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num > 0 && num % 2 == 0) {
                positiveNumbers.add(num);
            }
        }
        Collections.sort(positiveNumbers);
        assertEquals(expected, positiveNumbers);
    }

    @Test
    void testNoPositiveEvenNumbers() {
        List<Integer> numbers = Arrays.asList(-1, -3, 0, -5, -7, -9);

        List<Integer> expected = numbers.stream()
                .filter(x -> x > 0 && x % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num > 0 && num % 2 == 0) {
                positiveNumbers.add(num);
            }
        }
        Collections.sort(positiveNumbers);
        assertEquals(expected, positiveNumbers);
    }

    @Test
    void testEmptyList() {
        List<Integer> numbers = Collections.emptyList();

        List<Integer> expected = numbers.stream()
                .filter(x -> x > 0 && x % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num > 0 && num % 2 == 0) {
                positiveNumbers.add(num);
            }
        }
        Collections.sort(positiveNumbers);
        assertEquals(expected, positiveNumbers);
    }
}

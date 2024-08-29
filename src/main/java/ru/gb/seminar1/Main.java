package ru.gb.seminar1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalDouble average = numbers.stream() // создаем поток из списка чисел
                .filter(n -> n % 2 == 0) // фильтруем только чётные числа
                .mapToInt(n -> n) // преобразуем Integer в int
                .average(); // вычисляем среднее значение

        // Проверяем, есть ли значение, и выводим его на экран
        if (average.isPresent()) {
            System.out.println("Среднее значение всех четных чисел: " + average.getAsDouble());
        } else {
            System.out.println("Четных чисел в списке нет.");
        }
    }
}

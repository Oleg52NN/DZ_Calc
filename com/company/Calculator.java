package com.company;

import java.util.function.*;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;


public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    String s = "Деление на ноль";
    // Можно было исправить так:
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : (x > 0 ? MAX_VALUE : MIN_VALUE);
    // Так как в Integer не предусмотрена бесконечность,
    // то возвращается максимальный или минимальный элемент.
    // В зависимости от дальнейшего использования можно организовать проверку на их получение.
    // Второй способ показан ниже.
    BiFunction<Integer, Integer, String> divide = (x, y) -> (y != 0) ? Integer.toString(x / y) : s;
    // Если критично, что на выходе должен быть Integer, то используем первый способ.
    // Или, при условии корректного результата, конвертируем обратно строку в число.
    // Третий способ - выбросить ошибку. Реализован в main()
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    Consumer<String> printlnS = System.out::println;
    Consumer<Boolean> printlnB = System.out::println;

}

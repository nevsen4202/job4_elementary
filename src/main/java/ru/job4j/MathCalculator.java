package ru.job4j;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndMultiply(double first, double second) {
        return diff(first, second)
                + div(first, second);
    }

        public static double divAndMultiply(double first, double second) {
            return sum(first, second) + diff(first, second) + multiply(first, second)
                    + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + diffAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divAndMultiply(10, 20));
    }
}
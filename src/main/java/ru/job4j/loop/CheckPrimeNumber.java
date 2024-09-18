package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        for (int n = 2; n < number; n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
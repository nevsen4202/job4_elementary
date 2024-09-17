package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        for (int n = 2; n < number; n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }
}
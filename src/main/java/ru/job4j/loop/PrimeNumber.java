package ru.job4j.loop;

public class PrimeNumber {
    public static boolean check(int number) {
        for (int n = 2; n <= number - 1; n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calc(int finish) {
        int count = 0;
        for (int n = 2; n <= finish; n++) {
            if (check(n)) {
                count = count + 1;
            }
        }
        return count;
    }
}

package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                return index;
            }
        }
        return -1;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        for (int index = start; index <= finish; index++) {
            if (data[index] == element) {
                return index;

            }
        }
        return -1;
    }
}



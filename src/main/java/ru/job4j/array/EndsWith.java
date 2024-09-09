package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        if (postfix.length > word.length) {
            return false;
        }
        int offset = word.length - postfix.length;
        for (int i = 0; i < postfix.length; i++) {
            if (word[offset + i] != postfix[i]) {
                return false;
            }
        }
        return true;
    }
}


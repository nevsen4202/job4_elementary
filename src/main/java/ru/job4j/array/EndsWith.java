package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        int n = word.length - 1;
        for (int i = postfix.length - 1; i >= 0; i--, n--) {
            if (word[n] != postfix[i]) {
                return false;
            }
        }
        return true;
    }
}

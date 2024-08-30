package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
        char[] postfix = {'в', 'е', 'т'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
        char[] postfix = {'в', 'я', 'т'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEndWithPostixThenFalse() {
        char[] word = {'Я'};
        char[] postfix = {'И'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }
}
package ru.job4j;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.job4j.loop.Counter;

class CounterTest {
    @Test
    void whenStart0Finish10Sum55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus10FinishMinus1() {
        int start = -10;
        int finish = -1;
        int expected = -55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish1Sum0() {
        int start = 5;
        int finish = 1;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}
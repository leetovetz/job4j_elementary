package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void sumFrom0To5() {
        int expected = 15;
        int output = Counter.sum(0, 5);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumFrom5To0() {
        int expected = 0;
        int output = Counter.sum(5, 0);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumFrom1To1() {
        int expected = 1;
        int output = Counter.sum(1, 1);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumFrom3To8() {
        int expected = 33;
        int output = Counter.sum(3, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumFrom5To10() {
        int expected = 45;
        int output = Counter.sum(5, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven5(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromZeroTo20Then110() {
        int start = 0;
        int finish = 20;
        int result = Counter.sumByEven5(start, finish);
        int expected = 110;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromNegativeTenToTenThenZero() {
        int start = -10;
        int finish = 10;
        int result = Counter.sumByEven5(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromNegativeTenToNegativeTwoThenMinusThirty() {
        int start = -10;
        int finish = -2;
        int result = Counter.sumByEven5(start, finish);
        int expected = -30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven5(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}
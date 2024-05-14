package ru.job4j.calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenManHeight100Then0() {
        short input = 100;
        double expected = 0.0;
        double result = Fit.calculateManWeight(input);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight110Then0() {
        short input = 110;
        double expected = 0.0;
        double result = Fit.calculateWomanWeight(input);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenManHeight187Then100Dot05() {
        short input = 187;
        double expected = 100.05;
        double result = Fit.calculateManWeight(input);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight166Then64Dot4() {
        short input = 166;
        double expected = 64.4;
        double result = Fit.calculateWomanWeight(input);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}

package ru.job4j.calculator;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenManHeight100Then0() {
        short input = Fit.BASE_HEIGHT_MAN;
        double expected = 0.0;
        double result = Fit.calculateManWeight(input);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight110Then0() {
        short input = Fit.BASE_HEIGHT_WOMAN;
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

    @Test
    void whenManHeight250ThenHighWeight() {
        short input = 250; // Ќестандартно высокий рост дл€ проверки.
        double expected = (input - Fit.BASE_HEIGHT_MAN) * Fit.WEIGHT_MULTIPLIER;
        double result = Fit.calculateManWeight(input);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight50ThenNegativeWeight() {
        short input = 50;
        double expected = (input - Fit.BASE_HEIGHT_WOMAN) * Fit.WEIGHT_MULTIPLIER;
        double result = Fit.calculateWomanWeight(input);
        assertThat(result).isLessThan(0);
    }
}

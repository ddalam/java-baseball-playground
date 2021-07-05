import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @Test
    void testCalc() {
        StringCalculator stringCalculator = new StringCalculator();

        assertThat(stringCalculator.calc(20, 2, "/")).isEqualTo(10);
    }

    @Test
    void testStringCalculator() {
        StringCalculator stringCalculator = new StringCalculator();

        assertThat(stringCalculator.callCalc("2 + 3 * 4 / 2")).isEqualTo(10);
    }
}
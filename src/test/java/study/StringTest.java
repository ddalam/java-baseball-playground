package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1", "2");
    }

    @Test
    void substring() {
        String actual = "(1,2)";
        assertThat("1,2").isEqualTo(actual.substring(1, 4));
    }

    @Test
    void charAt() {
        String actual = "abc";
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    actual.charAt(3);
                });

    }
}

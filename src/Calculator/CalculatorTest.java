package Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(100, 20)).isEqualTo(80.0);
        assertThat(Calculator.calculatingDiscount(1.0, 10)).isEqualTo(0.9);
        assertThat(Calculator.calculatingDiscount(100.0, 0)).isEqualTo(100.0);
        assertThat(Calculator.calculatingDiscount(100.0, 100)).isEqualTo(0.0);

        assertThatThrownBy(
                () -> Calculator.calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(
                () -> Calculator.calculatingDiscount(100, -5))
                .isInstanceOf(ArithmeticException.class);

        assertThatThrownBy(
                () -> Calculator.calculatingDiscount(100, 101))
                .isInstanceOf(ArithmeticException.class);
    }
}





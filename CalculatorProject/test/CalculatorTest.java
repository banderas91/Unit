package CalculatorProject.test;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testCalculateDiscountValidArguments() {
        double purchaseAmount = 100.0;
        double discountPercentage = 10.0;
        double expectedDiscountedAmount = 90.0;
        
        double result = Calculator.calculateDiscount(purchaseAmount, discountPercentage);
        
        assertThat(result).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    public void testCalculateDiscountInvalidArguments() {
        double purchaseAmount = -100.0;
        double discountPercentage = 10.0;

        assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }
}

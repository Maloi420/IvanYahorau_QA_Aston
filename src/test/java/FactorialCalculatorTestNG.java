import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTestNG {

    @Test
    public void testFactorial() {
        assertEquals(FactorialCalculator.factorial(5), 120, "Факториал верен");
        assertEquals(FactorialCalculator.factorial(0), 1, "Факториал 0 должен быть 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialWithNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}
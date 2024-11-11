import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {
    @Test
    public void testFactorial() {
        assertEquals(24, FactorialCalculator.factorial(4), "Факториал верен");
        assertEquals(1, FactorialCalculator.factorial(0), "Факториал числа 0 должен быть равен 1");
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1), "Должно быть выброшено исключение IllegalArgumentException для отрицательного значения");
    }
}
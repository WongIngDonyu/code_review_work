import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 должно быть 5");
    }

    @Test
    void testDif() {
        assertEquals(1, calculator.dif(4, 3), "4 - 3 должно быть 1");
    }

    @Test
    void testDiv() {
        assertEquals(2, calculator.div(6, 3), "6 / 3 должно быть 2");
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0), "Деление на ноль должно выбросить ArithmeticException");
    }

    @Test
    void testTimes() {
        assertEquals(6, calculator.times(2, 3), "2 * 3 должно быть 6");
    }

    @Test
    void testSolver() {
        assertEquals(5, calculator.solver(2, 3, '+'), "2 + 3 должно быть 5");
        assertEquals(-1, calculator.solver(2, 3, '-'), "2 - 3 должно быть -1");
        assertEquals(6, calculator.solver(2, 3, '*'), "2 * 3 должно быть 6");
        assertEquals(2, calculator.solver(6, 3, '/'), "6 / 3 должно быть 2");
        assertThrows(IllegalArgumentException.class, () -> calculator.solver(1, 2, 'x'), "Неизвестный оператор должен выбросить IllegalArgumentException");
    }
}

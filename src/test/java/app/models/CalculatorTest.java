package app.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        double a = 5;
        double b = 4;
        assertEquals(a + b, calculator.add(a , b));
    }

    @Test
    void subtract() {
        double a = 10;
        double b = 4;
        assertEquals(a - b, calculator.subtract(a , b));
    }

    @Test
    void multiply() {
        double a = 2;
        double b = 3;
        assertEquals(a * b, calculator.multiply(a , b));
    }

    @Test
    void divide() {
        double a = 10;
        double b = 2;
        assertEquals(a / b, calculator.divide(a , b));
    }

    @Test
    void divideByZero(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(5,0));
    }
}
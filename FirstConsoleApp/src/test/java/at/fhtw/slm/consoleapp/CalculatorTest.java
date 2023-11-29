package at.fhtw.slm.consoleapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setup() {
        // Arrange
        calc = new Calculator();
    }

    @Test
    void add_positivePlusPositive_isPositive() {
        // Arrange
        int a = 1;
        int b = 2;

        // Act
        var actualResult = calc.add(1,2);

        // Assert
        assertTrue( actualResult>0 );
        assertTrue( actualResult >= a);
        assertTrue( actualResult >= b);
    }

    @Test
    void add_negativePlusNegative_isNegative() {
        // Arrange
        int a = -1;
        int b = -2;

        // Act
        var actualResult = calc.add(a,b);

        // Assert
        assertTrue( actualResult<3 );
        assertTrue( actualResult <= a);
        assertTrue( actualResult <= b);
    }

    @Test
    void add_MaximumNumbers() {
        // Act & Assert
        assertEquals(-2, calc.add(Integer.MAX_VALUE, Integer.MIN_VALUE));
        assertEquals( -2, calc.add(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals( -3, calc.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals( -1, calc.add(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
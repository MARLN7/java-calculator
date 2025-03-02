package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    void additional(){
        assertEquals(2, calculator.add(1,1));
        assertEquals(5, calculator.add(2,3));
        assertEquals(1, calculator.add(0,1));
    }

    @Test
    void subtraction(){
        assertEquals(1, calculator.subtract(1,0));
        assertEquals(10, calculator.subtract(15,5));
    }

    @Test
    void multiply(){
        assertEquals(0, calculator.multiply(200,0));
        assertEquals(10, calculator.multiply(5,2));
    }

    @Test
    void divide(){
        assertEquals(4, calculator.divide(8,2));

    }

    @Test
    void factorial(){
        assertEquals(1, calculator.factorial(3));
    }
}

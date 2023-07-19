package com.reverse_polish_notation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldCalculateAddition() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        String addition = "4 3 +";
        assertEquals(7, calculator.calculatePolishNotation(addition));
    }

    @Test
    public void shouldCalculateMultiplication() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        String addition = "4 3 *";
        assertEquals(12, calculator.calculatePolishNotation(addition));
    }

    @Test
    public void shouldCalculateAdditionWithSpaces() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        String addition = "   4       3       +      ";
        assertEquals(7, calculator.calculatePolishNotation(addition));
    }

    @Test
    public void shouldCalculateMultiplicationWithSpaces() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        String addition = "       4        3       *        ";
        assertEquals(12, calculator.calculatePolishNotation(addition));
    }

    @Test
    public void shouldCalculateSubtraction() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        String addition = "4 3 -";
        assertEquals(1, calculator.calculatePolishNotation(addition));
    }

    @Test
    public void shouldCalculateSubtractionWithSpaces() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        String addition = "       4        3       -        ";
        assertEquals(1, calculator.calculatePolishNotation(addition));
    }
}
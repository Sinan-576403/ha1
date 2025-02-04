package htw.berlin.prog2.ha1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display result after adding two positive multi-digit numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "40";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after getting the square root of two")
    void testSquareRoot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressUnaryOperationKey("√");

        String expected = "1.41421356";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    //Grüner Test
    @Test
    @DisplayName("should display result after subtracting two positive numbers")
    void testSubtraction() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "0";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    //Roter Test 1
    @Test
    @DisplayName("should display percentage")
    void negativeTestOne(){
        Calculator calc = new Calculator();

        calc.pressDigitKey(9);
        calc.pressUnaryOperationKey("%");
        calc.pressEqualsKey();

        String expected = "0.09";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
    //Roter Test 2
    @Test
    @DisplayName("should display results after '1/x'")
    void negativeTestTwo(){
        Calculator calc = new Calculator();

        calc.pressDigitKey(4);
        calc.pressUnaryOperationKey("1/x");
        calc.pressEqualsKey();

        String expected = "0.25";
        String actual = calc.readScreen();

        assertEquals(expected, actual);

    }

    }



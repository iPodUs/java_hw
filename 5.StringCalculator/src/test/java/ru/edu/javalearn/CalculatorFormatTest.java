package ru.edu.javalearn;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.edu.javalearn.services.Calculator;

public class CalculatorFormatTest {
    private static Calculator calculator;

    @BeforeClass
    public static void prepareClass(){
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnRightResultWithSpaces(){
        Assert.assertEquals("10.0", calculator.calculate("7 + 3"));
        Assert.assertEquals("10.0", calculator.calculate(" 7 + 3"));
        Assert.assertEquals("10.0", calculator.calculate("7 + 3 "));
        Assert.assertEquals("10.0", calculator.calculate(" 7   + 3 "));
        Assert.assertEquals("4.0", calculator.calculate(" 7   + (   -  3 )"));
    }

    @Test
    public void shouldReturnRightResultWithBrackets(){
        Assert.assertEquals("4.0", calculator.calculate("7+(-3)"));
        Assert.assertEquals("4.0", calculator.calculate("7 + (-3)"));
        Assert.assertEquals("-10.0", calculator.calculate("(-7) + (-3)"));
        Assert.assertEquals("4.0", calculator.calculate("7   + (   -3 )"));
        Assert.assertEquals("4.1", calculator.calculate("7.2+(-3.1)"));
    }

    @Test
    public void shouldReturnExceptionWhenArgumentMore4Symbols(){
        Assert.assertNull(calculator.calculate("1+12345"));
        Assert.assertNull(calculator.calculate("12345-12345"));
        Assert.assertNull(calculator.calculate("12345-1"));
        Assert.assertNull(calculator.calculate("-1234-(-1234)"));
        Assert.assertNull(calculator.calculate("-1.23+1"));
        Assert.assertNull(calculator.calculate("1-1.234"));
    }
}

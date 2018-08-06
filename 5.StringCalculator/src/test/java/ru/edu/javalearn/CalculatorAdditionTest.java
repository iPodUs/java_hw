package ru.edu.javalearn;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.edu.javalearn.services.Calculator;

public class CalculatorAdditionTest {
    private static Calculator calculator;

    @BeforeClass
    public static void prepareClass(){
        calculator = new Calculator();
    }

    @Test
    public void shouldReturn10WhenArgument7And3(){
        Assert.assertEquals("10.0", calculator.calculate("7+3"));
    }

    @Test
    public void shouldReturn4WhenArgument7AndMinus3(){
        Assert.assertEquals("4.0", calculator.calculate("7+(-3)"));
    }

    @Test
    public void shouldReturnMinus10WhenArgumentMinus7AndMinus3(){
        Assert.assertEquals("-10.0", calculator.calculate("-7+(-3)"));
    }
}

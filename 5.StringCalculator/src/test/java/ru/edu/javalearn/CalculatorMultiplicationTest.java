package ru.edu.javalearn;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.edu.javalearn.services.Calculator;

public class CalculatorMultiplicationTest {
    private static Calculator calculator;

    @BeforeClass
    public static void prepareClass(){
        calculator = new Calculator();
    }

    @Test
    public void shouldReturn21WhenArgument7And3(){
        Assert.assertEquals("21.0", calculator.calculate("7*3"));
    }

    @Test
    public void shouldReturnMinus21WhenArgument7AndMinus3(){
        Assert.assertEquals("-21.0", calculator.calculate("7*(-3)"));
    }

    @Test
    public void shouldReturn21WhenArgumentMinus7AndMinus3(){
        Assert.assertEquals("21.0", calculator.calculate("-7*(-3)"));
    }
}

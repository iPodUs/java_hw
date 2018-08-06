package ru.edu.javalearn;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.edu.javalearn.services.Calculator;

public class CalculatorDivisionTest {
    private static Calculator calculator;

    @BeforeClass
    public static void prepareClass(){
        calculator = new Calculator();
    }

    @Test
    public void shouldReturn7WhenArgument21And3(){
        Assert.assertEquals("7.0", calculator.calculate("21/3"));
    }

    @Test
    public void shouldReturnMinus7WhenArgument21AndMinus3(){
        Assert.assertEquals("-7.0", calculator.calculate("21/(-3)"));
    }

    @Test
    public void shouldReturn7WhenArgumentMinus21AndMinus3(){
        Assert.assertEquals("7.0", calculator.calculate("-21/(-3)"));
    }

    @Test
    public void shouldReturnNullWhenArgumentMinus21And0(){
        Assert.assertNull(calculator.calculate("21/0"));
    }
}

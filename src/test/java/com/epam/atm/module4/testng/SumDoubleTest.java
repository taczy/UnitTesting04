package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumDoubleTest extends BeforeAfterPreparation
{

    @Test(description = "Check double 'sum' method")
    @Parameters({"a", "b", "expected"})
    public void testSumDouble(double a, double b, double expected)
    {
        double sum = calc.sum(a, b);
        Assert.assertEquals(sum, expected, "Method double 'sum' returned not expected value: ");
    }

}
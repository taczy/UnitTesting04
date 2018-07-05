package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubDoubleTest extends BeforeAfterPreparation
{
	@Test(description = "Check double 'sub' method")
	@Parameters({"a", "b", "expected"})
	public void testDoubleSum(double a, double b, double expected)
	{
		double sub = calc.sub(a, b);
		Assert.assertEquals(sub, expected, "Method double 'sub' returned not expected value: ");
	}

}

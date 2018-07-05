package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static java.lang.Double.NaN;

public class PowTest extends BeforeAfterPreparation
{

	@Test(description = "Check 'pow' method", dataProvider = "PowDataProvider")
	public void testPow(double num1, double num2, double expected) throws Exception
	{
		double result = round(calc.pow(num1, num2), 7);
		Assert.assertEquals(result, expected, "Method 'pow' returned not expected value: ");
	}

	@DataProvider(name = "PowDataProvider")
	public Object[][] powDataProvider()
	{
		return new Object[][]
				{
						{2, 3, 8.0},
						{3.5, 2, 12.25},
						{2, 3.9, 14.9285279},
						{2, -2, 0.25},
						{10, 0, 1.0},
						{-3, 2, 9.0},
						{7.5, -1.4, 0.0595545},
						{-3.5, 2.2, NaN}
				};
	}
}
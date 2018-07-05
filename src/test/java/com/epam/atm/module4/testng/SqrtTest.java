package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static java.lang.Double.NaN;

public class SqrtTest extends BeforeAfterPreparation
{
	@DataProvider(name = "SinDataProvider")
	public Object[][] sinDataProvider()
	{
		return new Object[][]
				{
						{9, 3},
						{5.29, 2.3},
						{-100, NaN},
						{0, 0}
				};
	}

	@Test(description = "Check 'sin' method", dataProvider = "SinDataProvider")
	public void testSqrt(double num, double expected) throws Exception
	{
	double result = calc.sqrt(num);
	Assert.assertEquals(result, expected, "Method 'sqrt' returned not expected value: ");
	}

}
package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BeforeAfterPreparation
{
	@DataProvider(name = "SinDataProvider")
	public Object[][] sinDataProvider()
	{
		return new Object[][]
				{
						{Math.toRadians(90), 1},
						{Math.toRadians(30), 0.5},
						{Math.toRadians(60), 0.866},
						{0, 0},
						{Math.toRadians(180), 0}
				};
	}

	@Test(description = "Check 'sin' method", dataProvider = "SinDataProvider")
	public void testSin(double num, double expected) throws Exception
	{
		double result = round(calc.sin(num), 4);
		Assert.assertEquals(result, expected, "Method 'cos' returned not expected value: ");
	}

}
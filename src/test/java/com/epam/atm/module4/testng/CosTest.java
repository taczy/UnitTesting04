package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BeforeAfterPreparation
{

	@DataProvider(name = "CosDataProvider")
	public Object[][] cosDataProvider()
	{
		return new Object[][]
				{
						{Math.toRadians(90), 0},
						{Math.toRadians(30), 0.866},
						{Math.toRadians(60), 0.5},
						{0, 1},
						{Math.toRadians(180), -1}
				};
	}

	@Test(description = "Check 'cos' method", dataProvider = "CosDataProvider")
	public void testCos(double num, double expected) throws Exception
	{
		double result = round(calc.cos(num), 4);
		Assert.assertEquals(result, expected, "Method 'cos' returned not expected value: ");
	}
}
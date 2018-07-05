package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgTest extends BeforeAfterPreparation
{

	@DataProvider(name = "CtgDataProvider")
	public Object[][] ctgDataProvider()
	{
		return new Object[][]
				{
					{Math.toRadians(90), 0},
					{Math.toRadians(45), 1.0},
					{Math.toRadians(30), 1.7321}
				};
	}

	@Test(description = "Check 'ctg' method", dataProvider = "CtgDataProvider")
	public void testCtg(double num, double expected) throws Exception
	{
		double result = round(calc.ctg(num), 4);
		Assert.assertEquals(result, expected, "Method 'ctg' returned not expected value: ");
	}
}
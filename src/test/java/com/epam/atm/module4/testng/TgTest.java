package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BeforeAfterPreparation
{

	@DataProvider(name = "TgDataProvider")
	public Object[][] tgDataProvider()
	{
		return new Object[][]
				{
					{Math.toRadians(45), 1.0},
					{Math.toRadians(90), 1.633123935319537E16}, //tg 90 = Infinity
					{-Math.toRadians(45), -1.0},
					{Math.toRadians(30), 0.5774}
				};
	}

	@Test(description = "Check 'tg' method", dataProvider = "TgDataProvider")
	public void testTg(double num, double expected) throws Exception
	{
		double result = round(calc.tg(num), 4);
		Assert.assertEquals(result, expected, "Method 'tg' returned not expected value: ");
	}

	@Test(description = "Check 'tg' method for 0")
	public void testTg0 () throws Exception
	{
		double result = calc.tg(0);
		Assert.assertEquals(result, 0);
	}

}
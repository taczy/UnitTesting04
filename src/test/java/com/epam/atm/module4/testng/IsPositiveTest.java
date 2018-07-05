package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends BeforeAfterPreparation
{

	@DataProvider(name = "IsPositiveDataProvider")
	public Object[][] isPositiveDataProvider()
	{
		return new Object[][]
				{
						{-1, false},
						{0, false},
						{3, true},
						{-9223372036854775808L, false},
						{9223372036854775807L, true}
				};
	}

	@Test(description = "Check 'isPositive' method", dataProvider = "IsPositiveDataProvider", groups = "positive")
	public void testIsPositive(long num, boolean expected) throws Exception
	{
		boolean result = calc.isPositive(num);
		Assert.assertEquals(result, expected, "Method 'isPositive' returned not expected value: ");
	}

}
package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BeforeAfterPreparation
{
	@DataProvider(name = "IsNegativeDataProvider")
	public Object[][] isNegativeDataProvider()
	{
		return new Object[][]
				{
						{-1, true},
						{0, false},
						{3, false},
						{-9223372036854775808L, true},
						{9223372036854775807L, false}
				};
	}

	@Test(description = "Check 'isNegative' method", dataProvider = "IsNegativeDataProvider", dependsOnGroups = "positive")
	public void testIsNegative(long val, boolean expected) throws Exception
	{
		boolean result = calc.isNegative(val);
		Assert.assertEquals(result, expected, "Method 'isNegative' returned not expected value: ");
	}
}
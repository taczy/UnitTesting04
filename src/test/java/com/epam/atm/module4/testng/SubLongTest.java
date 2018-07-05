package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongTest extends BeforeAfterPreparation

{
	@DataProvider(name = "SubLongDataProvider")
	public Object[][] subLongDataProvider()
	{
		return new Object[][]
				{
						{87, 15, 72},
						{-100, 1, -101},
						{0, -78, 78},
						{10, 0, 10}
				};
	}

	@Test(description = "Check long 'sub' method", dataProvider = "SubLongDataProvider")
	public void testSubLong(long num1, long num2, long expected) throws Exception
	{
		long result = calc.sub(num1, num2);
		Assert.assertEquals(result, expected, "Method long 'sub' returned not expected value: ");
	}
}

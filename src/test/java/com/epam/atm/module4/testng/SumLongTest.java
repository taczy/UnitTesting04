package com.epam.atm.module4.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumLongTest extends BeforeAfterPreparation
{
	@Test(description = "Check long 'sum' method")
	@Parameters({"a", "b", "expected"})
	public void testSumLong(long a, long b, long expected)
	{
		long sum = calc.sum(a, b);
		Assert.assertEquals(sum, expected, "Method long 'sum' returned not expected value: ");
	}

}

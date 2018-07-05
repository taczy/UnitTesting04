package com.epam.atm.module4.junit;

import com.epam.atm.module4.testng.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultLongTest extends BaseCalcTest
{

	@Parameterized.Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]
				{
						{3, 6, 18},
						{-12, 5, -60},
						{-8, -7, 56},
						{918272, 45689,41954929408L}
				});
	}

	private long a;
	private long b;
	private long expected;

	public MultLongTest(long a, long b, long expected)
	{
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testLongMult() throws Exception
	{
		long mult = calc.mult(a, b);
		assertEquals("Method 'mult' returned not expected value: ", expected, mult);
	}
}

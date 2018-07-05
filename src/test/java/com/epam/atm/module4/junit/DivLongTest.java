package com.epam.atm.module4.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DivLongTest extends BaseCalcTest
{
	@Parameterized.Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]
				{
						{1334, 23, 57},
						{-35, 5, -7},
						{-42, -7, -6}
				});
	}

	private long a;
	private long b;
	private long expected;

	public DivLongTest(long a, long b, long expected)
	{
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testLongDiv()
	{
		long div = calc.div(a, b);
		assertEquals("Method 'div' returned not expected value: ", expected, div);
	}

	@Test(expected = NumberFormatException.class)
	public void testLongDivByZero() throws Exception
	{
		long n = calc.div(4L, 0L);
	}
}

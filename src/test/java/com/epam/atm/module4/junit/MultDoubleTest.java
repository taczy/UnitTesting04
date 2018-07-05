package com.epam.atm.module4.junit;

import com.epam.atm.module4.testng.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultDoubleTest extends BaseCalcTest
{

	@Parameterized.Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]
				{
						{2.5, 2.2, 5.5},
						{0, 5.88, 0.0},
						{-6.1, 0.2, -30.5}
				});
	}

	private double a;
	private double b;
	private double expected;

	public MultDoubleTest(double a, double b, double expected)
	{
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testDoubleMult() throws Exception
	{
		double mult = calc.mult(a, b);
		assertEquals("Method 'mult' returned not expected value: ", expected, mult);
	}

}

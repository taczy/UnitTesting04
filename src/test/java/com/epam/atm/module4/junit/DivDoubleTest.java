package com.epam.atm.module4.junit;

import com.epam.atm.module4.testng.Calculator;
import org.junit.Test;
import static junit.framework.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivDoubleTest extends BaseCalcTest
{

	@Parameterized.Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]
				{
						{66.66D, 2.2D, 30.3D},
						{-0.5, 5, -0.1},
						{-6, -1.2, 5.0}
				});
	}

	private double a;
	private double b;
	private double expected;

	public DivDoubleTest(double a, double b, double expected)
	{
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testDoubleDiv() throws Exception
	{
		double div = calc.div(a, b);
		assertEquals("Method 'div' returned not expected value: ", expected, div);
	}

	@Test(expected = NumberFormatException.class)
	public void testDivZeroDouble() throws Exception
	{
		double n = calc.div(4D, 0D);
	}



}


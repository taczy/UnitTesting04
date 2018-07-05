package com.epam.atm.module4.junit;

import com.epam.atm.module4.testng.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseCalcTest
{
	protected Calculator calc;

	public void setUp()
	{
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown()
	{
		calc = null;
	}
}

package com.epam.atm.module4.testng;

import org.testng.annotations.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BeforeAfterPreparation
{
	protected Calculator calc;

	@BeforeSuite(description = "Before suite preparations")
	public void beforeSuite()
	{
		System.out.println("Suite 'CalcTestSuite' started");
	}

	@BeforeClass(description = "Before class preparations")
	public void beforeClass()
	{
		System.out.println("Class started: " + getClass());
		System.out.println("Create instance of Calculator");
		calc = new Calculator();
	}

	@BeforeGroups(description = "Before groups preparations", value = {"positive"})
	public void beforeGroup()
	{
		System.out.println("Groups named 'positive' started");
	}


	@AfterClass(description = "After class preparations")
	public void afterClass()
	{
		calc = null;
		System.out.println("Class finished: " + getClass());
	}

	@AfterSuite(description = "After suite preparations")
	public void afterSuite()
	{
		System.out.println("Suite 'CalcTestSuite' finished");
	}

	protected static double round(double value, int places)
	{
		if (places < 0) throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}










}
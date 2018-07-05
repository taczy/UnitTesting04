package com.epam.atm.module4.testng;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding
{
	protected static double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}

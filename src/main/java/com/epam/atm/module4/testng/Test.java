package com.epam.atm.module4.testng;

public class Test extends Rounding
{

	public static void main(String args[]){
		double x1 = 3.5;
		double y1 = 2;
		double z1 = Math.pow(x1, y1);
		System.out.println(z1);

		double x2 = 2;
		double y2 = 3.5;
		double z2 = Math.pow(x2, y2);
		System.out.println(z2);

		double x3 = -3.5;
		double y3 = 2.2;
		double z3 = Math.pow(x3, y3);
		System.out.println(z3);


		double b1 = round (Math.cos(Math.toRadians(90)), 5);
		System.out.println(b1);


		double b2 = round(Math.tan(Math.toRadians(90)), 5);
		System.out.println(b2);


		double x4 = -100;
		System.out.println(Math.sqrt(x4));

		double x5 = 1;
		double y5 = 0;
		System.out.println(x5/y5);



	}
}
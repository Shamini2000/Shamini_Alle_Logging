package com.epam.LoggersTask;

public class SimpleInterest {
	public double moneyBorrowed;
	public double interest;
	public double timePeriod;
	
	public SimpleInterest() {
		super();
	}

	public static double simpleIntrest(double moneyBorrowed, double interest, double timePeriod) {
		double simpleIntrest;
		simpleIntrest = (moneyBorrowed * interest * timePeriod) / 100;
		return simpleIntrest;
	}

}

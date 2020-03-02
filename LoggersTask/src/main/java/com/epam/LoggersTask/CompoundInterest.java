package com.epam.LoggersTask;

public class CompoundInterest {
	public double principle;
	public double interest;
	public double numberOfYears;
	public double interestIsCompounded;
	
	public CompoundInterest() {
		super();
	}
	
	public static double compoundInterest(double principle, double interest, double numberOfYears, double interestIsCompounded) {
		double compoundInterest;
		compoundInterest = (1 + (interest/100));
		while(interestIsCompounded != 0) {
			compoundInterest = compoundInterest * (1 + (interest/100));
			interestIsCompounded--;
		} compoundInterest = compoundInterest * principle;
		return compoundInterest;
	}
}

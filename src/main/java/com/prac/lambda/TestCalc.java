package com.prac.lambda;

public class TestCalc {

	public static void main(String[] args) {
		CalcInterf cal = new CalcImpl();
		cal.add(10, 20);
		cal.add(20, 30);
		
	}
}

package com.prac.lambda;

public class CalcImpl implements CalcInterf {

	@Override
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("The sum of two numbers is : " + sum);
	}

}

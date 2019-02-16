package com.prac.lambda;

public class TestLambda {

	public static void main(String[] args) {
		
		CalcInterf cal = (x,y)->{
			int sum = x+y;
			System.out.println("The sum is : " + sum);
		};
		
		cal.add(10, 20);
		cal.add(20, 30);
	}
}

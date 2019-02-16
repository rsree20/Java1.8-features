package com.prac.lambda;

public class TestCalcInnerClass {

	public static void main(String[] args) {
		
		CalcInterf cal = new CalcInterf() {
			@Override
			public void add(int a, int b) {
				int sum = a+b;
				System.out.println("The sum is from inner class : " + sum);
			}
		};
		
		cal.add(10, 20);
		cal.add(20, 30);
	}
}

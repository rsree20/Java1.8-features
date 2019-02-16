package com.prac.lambda;

public class TestMathOperationInnerClass {

	public static void main(String[] args) {
		MathOperation math = new MathOperation() {
			@Override
			public double square(int number) {
				return number*number;
			}
		};
		
		System.out.println(math.square(36));
		System.out.println(math.square(10));
		System.out.println(math.square(46));
	}
}

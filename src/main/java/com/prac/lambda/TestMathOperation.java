package com.prac.lambda;

public class TestMathOperation {

	public static void main(String[] args) {
		MathOperation math = new MathOperationImpl();
		System.out.println(math.square(36));
		System.out.println(math.square(10));
		System.out.println(math.square(46));
	}
}

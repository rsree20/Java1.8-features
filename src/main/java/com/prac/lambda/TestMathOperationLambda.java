package com.prac.lambda;

public class TestMathOperationLambda {

	public static void main(String[] args) {
		/*MathOperation math = (num)->{
			return num*num;
		};*/
		
		/*MathOperation math = (num)->num*num;*/
		
		MathOperation math = num->num*num;
		
		System.out.println("lambda output");
		System.out.println(math.square(36));
		System.out.println(math.square(10));
		System.out.println(math.square(46));
	}
}

package com.prac.lambda;

public class TestDisplayLambda {

	public static void main(String[] args) {
		/*DisplayInterf disc = ()->{
			System.out.println("Hello from lambda!!");
		};*/
		
		DisplayInterf disc = ()->System.out.println("Hello from lambda!!");
		
		disc.showMessage();
	}
}

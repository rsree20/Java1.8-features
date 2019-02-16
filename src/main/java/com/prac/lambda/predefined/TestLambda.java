package com.prac.lambda.predefined;

public class TestLambda {

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=0; i<10; i++) {
				System.out.println("Child from lambda!!");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Parent from lambda!!");
		}
	}
}

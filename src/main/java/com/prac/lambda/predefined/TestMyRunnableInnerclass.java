package com.prac.lambda.predefined;

public class TestMyRunnableInnerclass {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Child from inner class" + Thread.currentThread().getName());
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Parent from inner class" + Thread.currentThread().getName());
		}
	}
}

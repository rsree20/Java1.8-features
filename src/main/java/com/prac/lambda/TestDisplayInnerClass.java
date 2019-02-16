package com.prac.lambda;

public class TestDisplayInnerClass {

	public static void main(String[] args) {
		DisplayInterf disc = new DisplayInterf() {
			
			@Override
			public void showMessage() {
				System.out.println("Hello from anonymous!!");
			}
		};
		
		disc.showMessage();
	}
}

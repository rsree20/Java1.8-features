package com.prac.lambda.predefined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCompLambda {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(34);
		list.add(3);
		list.add(7);
		
		/*Comparator<Integer> comp = (o1,o2)->-o1.compareTo(o2);*/
		
		Comparator<Integer> comp = (o1,o2)->{
			return -o1.compareTo(o2);
		};
		
		/*Collections.sort(list, (o1,o2)->-o1.compareTo(o2));*/
		
		Collections.sort(list, comp);
		System.out.println(list);
	}
}

package com.prac.lambda.predefined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComp {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(34);
		list.add(3);
		list.add(7);

		Collections.sort(list, new MyComp());
		System.out.println(list);
	}
}

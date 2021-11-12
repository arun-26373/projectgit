package org.s;

import java.util.List;
import java.util.Vector;

public class git {
	public static void main(String[] args) {
		
		List<Integer> c = new Vector <>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		System.out.println(c);
		int size = c.size();
		System.out.println(size);
		
		Integer get = c.get(3);
		System.out.println(get+"\n");
		
		for (int i = 0; i <c.size(); i++) {
			System.out.println(c.get(i));
			
			
		}
}}
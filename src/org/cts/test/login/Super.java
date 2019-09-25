package org.cts.test.login;

import java.util.ArrayList;
import java.util.List;

public class Super {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(10);
		System.out.println(li);
		for(Integer x:li){
			System.out.println(x);
		}
}
}
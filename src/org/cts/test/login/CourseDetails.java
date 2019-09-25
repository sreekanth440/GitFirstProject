package org.cts.test.login;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CourseDetails {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(10);
		System.out.println(li);
		List<Integer> si=new LinkedList<Integer>();
		si.addAll(li);
		si.add(2,19);
		si.add(55);
		System.out.println(si);
		
		int s=li.size();
		System.out.println(s);
		Integer i=si.get(6);
		System.out.println(i);
		int k=li.indexOf(10);
		System.out.println(k);
		int j=li.lastIndexOf(10);
		System.out.println(j);
		li.add(0,999);
		System.out.println(li);
		li.remove(3);
		System.out.println(li);
		li.set(0,5);
		System.out.println(li);
		for(int i1=0;i1<li.size();i1++);
		System.out.println(li.get(i));
		
	}
}

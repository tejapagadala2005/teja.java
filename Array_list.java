package com;
import java.util.ArrayList;
public class Array_list {
	public static void main(String[] args) {
		ArrayList <Object> a =new ArrayList <Object> ();
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(100);
		a.add(99);
		a.add(98);
		a.add(2,50);
		System.out.println("elements at index 2:"+a.get(2));
		a.set(2,55);
		System.out.println("after set at index 2:"+a);
		a.remove(3);
		System.out.println("after remove index 3:"+a);
		System.out.println("contains 99?"+a.contains(99));
		System.out.println("index of 99:"+a.indexOf (99));
		a.add(99);
		System.out.println("last index of 99:"+a.lastIndexOf(99));
		System.out.println("size:"+a.size());
		System.out.println("is empty?"+a.isEmpty());
		System.out.println("sublist(1to4):"+a.subList(1,4));
		a.clear();
		System.out.println("after clear:"+a);
	}

}

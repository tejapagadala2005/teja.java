package com;

public class sumof_firstandlast {
	public static void sum(int a[]) {
		System.out.println(a[0]+a[a.length-1]);
	}
	public static void main(String[] args) {
		int a[]= {2,3,4,1,5};
		sum(a);
	}

}

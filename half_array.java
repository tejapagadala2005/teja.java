package com;

public class half_array {
	public static void half(int a[]) {
		for(int i=0;i<=(a.length-1)/2;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int a[]= {2,3,5,6,9,12,14,16,18,20,10,30};
		half(a);
	}

}

package com;

public class methodoverloading {
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(float a,float b) {
		System.out.println(a+b);
	}
public static void add(double a,double b) {
	System.out.println(a+b);
	}
public static void main(String[] args) {
	add(10,20);
	add(10.5,20.6);
	add(78.00,99.00);
}
}

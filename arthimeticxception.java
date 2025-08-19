package com;

public class arthimeticxception {
	public static void main(String[] args) {
		int a=100;
		int b=0;
		int c=a+b;
		System.out.println(c);
		int d=a-b;
		System.out.println(d);
		try {
			int res=a/b;
			System.out.println(res);
		}
		catch( Exception e) {
			System.out.println("it cannot divide by 0");
		}
		int f=a*b;
		System.out.println(f);
	}

}

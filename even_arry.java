package com;

import java.util.Scanner;

public class even_arry {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the size");
			int size=sc.nextInt();
			int a[]=new int[size];
			for(int i=0;i<=a.length-1;i++) {
					System.out.println("enter elements in index"+i);
					a[i]=sc.nextInt();
				}
			for( int i=0;i<=a.length-1;i++) {
				if(a[i]%2==0) {
					System.out.println("even elemnts"+a[i]);
				}
			}
		}
	}

}

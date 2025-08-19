package com;
import java.util.Scanner;
public class dowhile {
	public static void main(String[] arg) {
		try (Scanner Sc = new Scanner(System.in)) {
			int start=Sc.nextInt();
			int end=Sc.nextInt();
			int n=7;int count=0;
			do {
				if(n%start==0) {
					count++;
				}
				start++;
			}
			while(start<=end);
			if( count==2) {
				System.out.println("prime");
			}
			else {
				System.out.println("not");
			}
		}
	}

}

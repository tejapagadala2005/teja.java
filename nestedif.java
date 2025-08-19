package com;
import java.util.Scanner;
public class nestedif {
	public static void main(String[] arg) {
		try (Scanner Sc = new Scanner(System.in)) {
			int a=Sc.nextInt();
			if(a%3==0) {
				if(a%9==0) {
					System.out.println("number is divisible by 3&9");
				}
			}
		}
	}

}

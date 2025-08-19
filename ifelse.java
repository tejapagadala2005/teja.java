package com;
import java.util.Scanner;
public class ifelse {
	public static void main(String[] arg) {
		try (Scanner Sc = new Scanner(System.in)) {
			int age=Sc.nextInt();
			if(age>=18) {
				System.out.println("eligible for vote");
			}
			else {
				System.out.println("not eligible for vote");
			}
		}
	}

}

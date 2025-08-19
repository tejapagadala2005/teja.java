package com;
import java.util.Scanner;
public class While {
	public static void main(String[] arg) {
		try (Scanner Sc = new Scanner(System.in)) {
			int start=Sc.nextInt();
			int end=Sc.nextInt();
			while(start<=end) {
				System.out.println(start);
				start++;
			}
		}
	}

}

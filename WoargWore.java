package com;
import java.util.Scanner;
public class WoargWore {
	public static void add() {
		try (Scanner Sc = new Scanner(System.in)) {
			int a=Sc.nextInt();
			int b=Sc.nextInt();
			int result=a+b;
			System.out.println(result);
		}
	}
	public static void main(String[]arg) {
		add();
	}

}

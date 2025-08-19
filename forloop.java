package com;
import java.util.Scanner;
public class forloop {
	public static void main(String[] arg) {
		try (Scanner Sc = new Scanner(System.in)) {
			int i=Sc.nextInt();
			for(i=1;i<=10;i++) {
				System.out.println(i);
			}
		}
	}

}

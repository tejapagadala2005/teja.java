package com;
import java.util.Scanner;
public class inputmissmatchexception {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			try {
				int a=sc.nextInt();
				System.out.println(a);
			}
			catch(Exception e) {
				System.out.println("it is not match");
			}
		}
	}

}

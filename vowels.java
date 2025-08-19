package com;
import java.util.Scanner;
public class vowels {
	public static void main(String[] arg) {
		try (Scanner Sc = new Scanner(System.in)) {
			char ch=Sc.next().charAt(0);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				System.out.println("ch is vowel");
				}
		}
		}
	}



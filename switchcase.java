package com;
import java.util.Scanner;
public class switchcase {
	public static void main(String[] arg) {
		try (Scanner Sc = new Scanner(System.in)) {
			char ch=Sc.next().charAt(0);
			switch(ch) {
			case'a':
				System.out.println("vowel");
				break;
			case'A':
				System.out.println("vowel");
				break;
			case'e':
				System.out.println("vowel");
				break;
			case'E':
				System.out.println("vowel");
				break;
			case'i':
				System.out.println("vowel");
				break;
			case'I':
				System.out.println("vowel");
				break;
			case'o':
				System.out.println("vowel");
				break;
			case'O':
				System.out.println("vowel");
				break;
			case'u':
				System.out.println("vowel");
				break;
			case'U':
				System.out.println("vowel");
				break;
				default:
					System.out.println("not");
			
			}
		}
	}

}

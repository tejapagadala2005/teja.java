package com;

public class StringIndexOutOfBoundexception {
	public static void main(String[] args) {
		String s="hello";
		try {
			char ss=s.charAt(9);
			System.out.println(ss);
		}
		catch( Exception e) {
			System.out.println("it is not found");
		}
	}

}

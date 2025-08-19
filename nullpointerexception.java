package com;

public class nullpointerexception {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String hi=null;
		try {
			System.out.println(hi.length());
		}
		catch(Exception e) {
			System.out.println("it is null");
		}
	}

}

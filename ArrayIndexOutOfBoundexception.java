package com;

public class ArrayIndexOutOfBoundexception {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8};
		try {
			int res=arr[7];
			System.out.println(res);
		}
		catch( Exception e) {
			System.out.println("that array values is not present");
		}
	}

}

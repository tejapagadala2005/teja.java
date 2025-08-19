package com;

public class array3 {
	public static void main(String[] args) {
		int[]arr=new int[10];
		arr[0]=1;
		arr[1]=3;
		arr[2]=89;
		arr[4]=70;
		arr[8]=12;
		arr[9]=15;
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
			System.out.println("----------------");
			System.out.println("----------------");
			for(int j=arr.length-1;j>=0;j--) {
				System.out.println(arr[j]);
		}
	}

}

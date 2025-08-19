package com;

public class linear_search {
	public static void main(String[] args) {
		int[]arr= {9,8,6,6,3,7,0,2,2,3};
		int target=2;
		Boolean found=false;
		for (int i = 0; i <=arr.length-1; i++) {
			if (arr[i]==target) {
				System.out.println("found at index:"+i);
				found=true;
				break;
			}
		}
		if (!found) {
			System.out.println("not found");
		}
	}

}

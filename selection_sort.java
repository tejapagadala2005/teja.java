package com;
public class selection_sort {
	public static void main(String[] args) {
		int []arr= {9,8,6,3,7,0,2};
		for (int i = 0; i <= arr.length-1; i++) {
			int mindex=i;
			for (int j = i+1; j <= arr.length-1; j++) {
				if (arr[j]<arr[mindex]) {
					mindex=j;
				}
			}
			int temp=arr[mindex];
			arr[mindex]=arr[i];
			arr[i]=temp;
		}
		System.out.println("sorted array");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}

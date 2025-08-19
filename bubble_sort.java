package com;
public class bubble_sort {
	public static void main(String[] args) {
		int[]arr= {9,8,6,6,3,7,0,2,2,3};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("sorter array:");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}

}

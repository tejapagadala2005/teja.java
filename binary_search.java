package com;
public class binary_search {
	public static void main(String[] args) {
		int[]arr= {2,4,6,8,10,11,14,16};
		int target=14;
		int low=0,high=arr.length-1;
		boolean found=false;
		while (low<=high) {
			int mid=(low+high)/2;
			if (arr[mid]==target) {
				System.out.println("found at index:"+mid);
				found=true;
				break;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if (!found) {
			System.out.println("not found");
		}
	}

}

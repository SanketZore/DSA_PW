package _1_Searching;

import java.util.Arrays;

public class SelectionSort {
	
	
	
	public static void SelectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//min_idx is taking the index of minimum element at every iteration.
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			if(min_idx!=1) {
				// swap between arr[min_idx] and arr[i]
				int temp=arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
			}
		}
	
	}

	public static void main(String[] args) {

		/*
		 Selection Sort 
		 
		 	At Every iteration, we get smaller element in the extreme left.
		 
		 Time Complexity: O(n^2)
		 Space Complexity: O(1)
		 
		 */
		
		
		int[] arr= {20,50,12,90,19,25,97,16};
		SelectionSort(arr);
		System.out.println("Sorted array is: "+ Arrays.toString(arr));
		
		
	}

}

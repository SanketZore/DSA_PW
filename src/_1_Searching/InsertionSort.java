package _1_Searching;

import java.util.*;
import java.io.*;
public class InsertionSort {
	
	public static void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				// swap the elements between arr[j] and arr[j-1]
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
				j--;
			}
		}
	}

	public static void main(String[] args) {


		/*
		 Insertion Sort
		 Best Case Time complexity:O(n)
		 Worst Case Time complexity:O(n^2)
		 space Compexity: O(1)
		 
		 
		 */
		
		int[] arr= {20,50,25,67,79,12,15};
		InsertionSort(arr);
		System.out.println("Sorted Array is : "+ Arrays.toString(arr));
		
		
	}

}

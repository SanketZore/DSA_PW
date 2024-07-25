package _1_Searching;

import java.util.*;

public class BubbleSorting {
	
	public static void bubbleSorting(int[] arr) {
		for(int i=0;i<=arr.length;i++) {
			boolean swapped=false;
			// for every iteration, we get the biggest element in an array in the end.
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap between arr[j] and arr[j+1]
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 Bubble Sorting:
		 	
		 Stable or Not stable algo: if relative order maintained then stable else not stable.
		 
		 Inplace: not using extra space except array space.	
		 Outplace: using extra space except array space.
		 
		 Time Complexity: O(n^2)
		 Space Complexity: O(1)
		 
		 Interview Question: How many sorting algo's do you know?
		 	Dont say: Bubble sort, Insertion sort, Linear Sort.
		 	Instead say:  Comparision sort= Bubble, Insertion, Selection.
		 				  Non Comparision sort= Count sort, Radix sort.
		 	
		 */
		
		
		int[] arr= {20,50,10,12,45,67,90};
		bubbleSorting(arr);
		System.out.println("Sorted array is: ");
		System.out.println(Arrays.toString(arr));
	}

}

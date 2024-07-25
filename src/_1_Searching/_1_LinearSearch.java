package _1_Searching;

import java.util.Scanner;

public class _1_LinearSearch {

	public static void main(String[] args) {
		
		
//		 Searching in Arrays.
		 
			//Time Compexity: O(1)
			/*
			 Advantage
			 -Simple to understand.
			 -It is usefull in every kind(Sorted or Unsorted) of any array
			 
			 */

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements in array: ");
			int n=sc.nextInt();
			System.out.println("Enter Array Elements: ");
			
			//Array Creation 
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			// Target Element
			System.out.println("Enter target element: ");
			int target=sc.nextInt();
			
			int idx=-1;
			for(int i=0;i<n;i++) {
				if(arr[i]==target) {
					idx=i;
					break;
				}
			}
			if(idx==-1) {
				System.out.println("Target Element Not Found");
			}else {
				System.out.println("Target Element at Index: "+idx);
			}
			
		}

}

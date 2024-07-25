package _1_Searching;

import java.util.*;
public class _2_BinarySearch {
	
	
	public static int binarySearch(int[] arr,int target) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		
		/*
		 
		 Binary Search 
		 	sorted Array
		 		increasing/decreasing
		 		
		 0	 1	 2	  3	  4	  5		
		 2	 4	 6	 12	 14	 16 
		 
		 target=14
	 ->  Output=4
	 
	 
	 low=0
	 high=5
	 while(low <=high):
		 mid=(0+5)/2=2
		 if (arr(mid)==x):
		 	return mid;
		 else (arr(mid)<x) :
		 	low=mid+1
		 else ()	
		 
	
	mid=(low+high)/2;
	mid=low+(high-low)/2      --- Recommended
	
	N/2^0 + N/2^1 + N/2^2 + ..... + 1 
	
	N/2^K=1
	
	N=2^k
	
	log.2N=k (log.2)^2

	k=log.2N      //Iterations
	
	
	Time Complexity= O(log.2N)			// . = for base to log
	Space Complexity = O(1)
	
	
	Advantage : 
		-Data is very large then use binary search.
	Disadvantage: 
		-Sorted Data is required.
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
		int x=sc.nextInt();
		
		int result=binarySearch(arr,x);
		
		
		if(result ==0) {
			System.out.println("Target Element Not Found");
		}else {
			System.out.println("Target Element at Index: "+result);
		}
		
		
		
	}

}

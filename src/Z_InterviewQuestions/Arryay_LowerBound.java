package Z_InterviewQuestions;
import java.util.*;
public class Arryay_LowerBound {

	// Modification of Binary Search
	// Time Compexity: O(log n)
	// Space Complexity: O(1) 
	
	public static int findingOfFirstOccurance(int[] arr, int target) {
		
		int low=0,high=arr.length-1;
		int result=-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid] == target) {
				//traverse to the left side of an array.
				result=mid;
				high=mid-1;
			}else if(arr[mid]>target) {
				high=mid-1;
			}else {
				low=mid+1;
			}	
		}
		return result;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 Lower Bound= Find the first occurance of target.
		 
		 Sorted array:
		 0	 1	 2	 3	 4	  5	  6
		 2	 4	 7	 7	 9	 12	 14
		 
		 target=7
		 output=2
		
		Approach  --> Binary Search
		
		 Time Complexity: O(Log n)
		 Space Complexity: O(1)
		 
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number in an array: ");
		int n=sc.nextInt();
		int arr[] =new int[n];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Target Element: ");
		int target=sc.nextInt();
		
		int result=findingOfFirstOccurance(arr, target);
		if(result==-1) {
			System.out.println("Targte elemnt is not present in an array.");
		}else {
			System.out.println("Target element first occurance is present at index: "+result);
		}
		
		
		
	}

}

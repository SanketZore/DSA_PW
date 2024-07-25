package Z_InterviewQuestions;

import java.util.*;

public class SquareRoot {
	
	// Approach: Modified Binary Search
	//Time Complexity: O(log n)
	//Space Complexity: O(1)
	
	public static int findSquareRoot(int num) {
		int low=0,high=num,result=-1;
		
		//modified binary search
		while(low<=high) {
			int mid=low+(high-low)/2;
			long val=mid*mid;
			
			if(val==num) {
				//perfect square root
				return mid;
			}else if(val<num) {
				//Store the floor value, incase the number is not perfect square root, we can print the floor value.
				result=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Square Root of a given number.
		 */
		
		Scanner sc= new Scanner(System.in);	
		
		System.out.println("Enter the number of which you want the square root: ");
		int num=sc.nextInt();
		
		//function calling
		int result=findSquareRoot(num);
		System.out.println("Square root of the number is :" +result);
		
		
	}

}

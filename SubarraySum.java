package zohointerviewpreparation;

import java.util.Scanner;

public class SubarraySum 
{
	public static void main(String[]args)
	   {
		   Scanner scn = new Scanner(System.in);
		   System.out.print("Enter the number of elements you want to store: ");   
		   int n=scn.nextInt();  
		   int[] arr = new int[n];  
		   System.out.println("Enter the elements of the array: ");  
		   for(int i=0; i<n; i++)  
		   {    
		      arr[i]=scn.nextInt();  
		   }  
		   System.out.println(maxSubarraySum(arr, n));
	  }  
	static long maxSubarraySum(int arr[], int n)
    {
         long sum = 0;
     long ans = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (sum > ans) 
            {
                ans = sum;
            }
            if (sum < 0) 
            {
                sum = 0;
            }
        }
        return ans; 
    }
}

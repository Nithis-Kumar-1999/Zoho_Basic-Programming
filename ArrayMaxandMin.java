package zohointerviewpreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxandMin 
{
  static void firstmaxmin(int[] arr)
  {
	  Arrays.sort(arr);
	  int n=arr.length;
	  int result[]=new int [n];
	  int left=0, right=n-1;
	  for(int i=0;i<n;i++) 
	  {
		  if(i%2==0)
		  {
			  result[i]=arr[right];
			  right--;
		  }
		  else
		  {
			  result[i]=arr[left];
		      left++;
		  }
	  }
	  for (int num : result)
	  {
          System.out.print(num + " ");
      }
      System.out.println();
  }
		  
  public static void main(String[] args) 
  {
	Scanner scn = new Scanner(System.in);
	int n=scn.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scn.nextInt();
	}
	firstmaxmin(arr);
  }
}

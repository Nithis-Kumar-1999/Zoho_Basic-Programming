package zohointerviewpreparation;

import java.util.Arrays;
import java.util.Scanner;

public class DesAsc 
{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Array size: ");
	        int n = scanner.nextInt();
	        int[] a = new int[n];
	        System.out.print("Enter Elements: ");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < n-1; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (i % 2 == 0)
	                {
	                    if (a[i] < a[j]) 
	                    {
	                        int temp = a[i];
	                        a[i] = a[j];
	                        a[j] = temp;
	                    }
	                } 
	                else 
	                {
	                    if (a[i] > a[j]) 
	                    {
	                        int temp = a[i];
	                        a[i] = a[j];
	                        a[j] = temp;
	                    }
	                }
	            }
	        }

	        System.out.print("Array elements: ");
	        for (int i = 0; i < n; i++) 
	        {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	    }
}

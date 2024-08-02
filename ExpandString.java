package zohointerviewpreparation;
import java.util.Scanner;

public class ExpandString 
{
	    public static void main(String[] args) 
	    {
	        Scanner scn = new Scanner(System.in);
	        char[] a = new char[100];
	        char alpha = 0;
	        int num = 0;
	        int i,j;
	        
	        String input = scn.nextLine();
	        a = input.toCharArray();
	        
	        for (i = 0; i < a.length; i++) 
	        {
	            if ((a[i] >= 65 && a[i] <= 90) || (a[i] >= 97 && a[i] <= 122)) 
	            {
	                if (alpha != 0)
	                {
	                    for (j = i+1; j < num; j++) 
	                    {
	                        System.out.print(alpha);
	                    }
	                    num = 0;
	                } 
	                alpha = a[i];
	            }
	                else if (a[i] >= 48 && a[i] <= 57) 
	                {
	                    num = num * 10 + (a[i] - 48);
	                }
	                for (j = 0; j < num; j++)
	                {
	                    System.out.print(alpha);
	                }
	        }
	    }
}

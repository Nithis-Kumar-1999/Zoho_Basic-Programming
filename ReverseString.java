/*Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

Examples:

Input: str = "a,b$c"
Output: str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed

Input: str = "Ab,c,de!$"
Output: str = "ed,c,bA!$"*/

package zohointerviewpreparation;
import java.util.Scanner;

public class ReverseString
{
   public static void main(String[]args)
   {
	   Scanner scn = new Scanner(System.in);
	    String str1 = scn.nextLine();  
	    System.out.println(ReverseString(str1));
   }
	
	public static String ReverseString(String str)
	{
		char[] charArray = str.toCharArray();
        int left=0, right = charArray.length-1;
        while(left < right)
        {
        	if(!Character.isAlphabetic(charArray[left]))
        	{
        		left++;
        	}
        	if(!Character.isAlphabetic(charArray[right]))
        	{
        		right--;
        	}
        	else 
        	{
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }
        return new String(str);
	}
}

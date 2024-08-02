package zohointerviewpreparation;

public class SubstringOccurence 
{

	    public static int findSubstringIndex(String str1, String str2) 
	    {
	        if (str2.isEmpty())
	        {
	            return 0; 
	        }

	        int len1 = str1.length();
	        int len2 = str2.length();

	        for (int i = 0; i <= len1 - len2; i++) 
	        {
	            int j;
	            for (j = 0; j < len2; j++)
	            {
	                if (str1.charAt(i + j) != str2.charAt(j)) //If a mismatch is found (str1.charAt(i + j) != str2.charAt(j)), breaks out of the inner loop and moves to the next starting index i.

	                {
	                    break;
	                }
	            }
	            if (j == len2) /*If the inner loop completes (j == len2), it means all characters of str2 matched starting from index i in str1.
	            	Returns the current index i, which is the starting index of the first occurrence of str2 in str1.*/
	            {
	                return i; 
	            }
	        }

	        return -1; 
	    }

	    public static void main(String[] args) 
	    {
	        String str1 = "sadbutsad";
	        String str2 = "sad";
	        int index1 = findSubstringIndex(str1, str2);
	        System.out.println("Index of substring in str1: " + index1); 

	        String str3 = "testing12";
	        String str4 = "1234";
	        int index2 = findSubstringIndex(str3, str4);
	        System.out.println("Index of substring in str3: " + index2); 
	    }
}

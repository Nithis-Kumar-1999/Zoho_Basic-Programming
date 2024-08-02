package zohointerviewpreparation;

public class ReverseWords 
{
	    
	    public static String ReverseWords(String input, int index) 
	    {
	    	        // Split the input string into an array of words
	    	        String[] words = input.split("\\s+");
	    	        
	    	        // If the index is out of bounds, return the original input
	    	        if (index < 0 || index >= words.length)
	    	        {
	    	            return input;
	    	        }
	    	        
	    	        // Reverse words from index to the end
	    	        reverseArray(words, index, words.length - 1);
	    	        
	    	        // Join the words array into a single string
	    	        StringBuilder sb = new StringBuilder();
	    	        for (String word : words)
	    	        {
	    	            sb.append(word).append(" ");
	    	        }
	    	        
	    	        // Remove the trailing space and return the result
	    	        return sb.toString().trim();
	     }
	    	    
	    	    // Helper function to reverse an array of strings from start to end index
	    	    private static void reverseArray(String[] arr, int start, int end)
	    	    {
	    	        while (start < end)
	    	        {
	    	            String temp = arr[start];
	    	            arr[start] = arr[end];
	    	            arr[end] = temp;
	    	            start++;
	    	            end--;
	    	        }
	    	    }
	    	    
	    	    public static void main(String[] args) 
	    	    {
	    	        // Example usage:
	    	        String input1 = "Hello world main";
	    	        int index1 = 0;
	    	        System.out.println("Input: " + input1);
	    	        System.out.println("Index: " + index1);
	    	        System.out.println("Output: " + ReverseWords(input1, index1));
	    	        
	    	        String input2 = "We made india. We love india";
	    	        int index2 = 3;
	    	        System.out.println("\nInput: " + input2);
	    	        System.out.println("Index: " + index2);
	    	        System.out.println("Output: " + ReverseWords(input2, index2));
	    	    }


}

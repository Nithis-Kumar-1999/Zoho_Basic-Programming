package zohointerviewpreparation;
import java.util.Stack;
public class UnbalancedParanthesis 
{
	    public static String removeUnbalancedParentheses(String input) 
	    {
	        Stack<Integer> stack = new Stack<>();
	        char[] chars = input.toCharArray();

	        for (int i = 0; i < chars.length; i++)
	        {
	            if (chars[i] == '(') 
	            {
	                stack.push(i);
	            } else if (chars[i] == ')')
	            {
	                if (!stack.isEmpty() && chars[stack.peek()] == '(') 
	                {
	                    stack.pop();
	                } else {
	                    chars[i] = ' ';  // Mark as space to remove later
	                }
	            }
	        }

	        // Remove remaining unbalanced opening parentheses from stack
	        while (!stack.isEmpty()) 
	        {
	            chars[stack.pop()] = ' ';  // Mark as space to remove later
	        }

	        // Construct the final output string
	        StringBuilder result = new StringBuilder();
	        for (char c : chars) 
	        {
	            if (c != ' ') 
	            {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) 
	    {
	        String input1 = "((abc)((de))";
	        String input2 = "(((ab)";

	        System.out.println("Input  : " + input1);
	        System.out.println("Output : " + removeUnbalancedParentheses(input1));

	        System.out.println("\nInput  : " + input2);
	        System.out.println("Output : " + removeUnbalancedParentheses(input2));
	    }
}

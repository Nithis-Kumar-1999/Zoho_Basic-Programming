package zohointerviewpreparation;

import java.util.*;

public class BalancedBrackets 
{

    public static boolean isBalanced(String expression) 
    {
        Stack<Character> stack = new Stack<>();
        for (char bracket : expression.toCharArray())
        {
            if (bracket == '(' || bracket == '{' || bracket == '[') 
            {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == '}' || bracket == ']') 
            {
                if (stack.isEmpty()) 
                {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if ((bracket == ')' && top != '(') ||
                    (bracket == '}' && top != '{') ||
                    (bracket == ']' && top != '[')) 
                {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // If stack is empty, expression is balanced
    }

    public static void main(String[] args) 
    {
        String input1 = "{({(()[])})}";
        String input2 = "{}[([)]";
        
        if (isBalanced(input1)) 
        {
            System.out.println("Input 1 is Balanced");
        } else 
        {
            System.out.println("Input 1 is Not Balanced");
        }
        
        if (isBalanced(input2)) 
        {
            System.out.println("Input 2 is Balanced");
        } else 
        {
            System.out.println("Input 2 is Not Balanced");
        }
    }
}

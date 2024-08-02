package zohointerviewpreparation;
import java.util.Stack;

public class ValidExpression 
{
    public static void main(String[] args) 
    {
        String[] expressions = 
        {
            "(a+b)(a*b)",   // Valid
            "(ab)(ab+)",    // Invalid
            "((a+b)",       // Invalid
            "((a+b)*(c-d))" // Valid
        };

        for (String expression : expressions) 
        {
            System.out.println("Input: " + expression);
            if (isValidExpression(expression)) 
            {
                System.out.println("Output: Valid\n");
            } else 
            {
                System.out.println("Output: Invalid\n");
            }
        }
    }

    public static boolean isValidExpression(String expr) 
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) 
        {
            char ch = expr.charAt(i);

            if (ch == '(') 
            {
                stack.push(ch);
            } else if (ch == ')') 
            {
                if (stack.isEmpty())
                {
                    return false; // No matching opening parenthesis
                }
                stack.pop(); // Pop the corresponding '('
            }
            // Ignore other characters since we're only checking parentheses
        }
        // If stack is empty at the end, all opening parentheses had a matching closing parenthesis
        return stack.isEmpty();
    }
}

package zohointerviewpreparation;

public class PrintOddLetters 
{
    public static void main(String[] args) 
    {
        String word = "geeksforgeeks";
        int length = word.length();
        
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                if (j == i || j == length - 1 - i) 
                {
                    System.out.print(word.charAt(j));
                } else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

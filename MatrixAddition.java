package zohointerviewpreparation;
import java.util.Scanner;
public class MatrixAddition 
{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        long sum = 0;

	        for (int i = 0; i < n; i++) {
	            int size = scanner.nextInt();

	            int[] array = new int[size];
	            for (int j = 0; j < size; j++) 
	            {
	                array[j] = scanner.nextInt();
	            }

	            long number = arrayToNumber(array);

	            sum += number;
	        }

	        System.out.println(sum);

	        scanner.close();
	    }

	    private static long arrayToNumber(int[] array) 
	    {
	        StringBuilder sb = new StringBuilder();
	        for (int digit : array) 
	        {
	            sb.append(digit);
	        }
	        return Long.parseLong(sb.toString());
	    }
}

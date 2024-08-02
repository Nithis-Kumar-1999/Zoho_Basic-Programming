package zohointerviewpreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0) 
        {
            return res;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) 
        {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j++)
            {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j++) 
            {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) 
            {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j--)
                {
                    res.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            if (colBegin <= colEnd) 
            {
                // Traverse Up
                for (int j = rowEnd; j >= rowBegin; j--) 
                {
                    res.add(matrix[j][colBegin]);
                }
                colBegin++;
            }
        }

        return res;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrix
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Read the matrix elements
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create an instance of SpiralMatrix and get the spiral order
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> result = spiralMatrix.spiralOrder(matrix);

        // Print the result
        System.out.println("Spiral order of the matrix:");
        for (int num : result)
        {
            System.out.print(num + " ");
        }
    }
}

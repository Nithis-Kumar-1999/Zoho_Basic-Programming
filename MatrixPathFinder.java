package zohointerviewpreparation;

import java.util.*;

public class MatrixPathFinder 
{

    public static void main(String[] args) 
    {
        String input = "OneTwoOneTwoOneTwoOne";
        String find = "woo";

        // Calculate the matrix size
        int size = (int) Math.sqrt(input.length());
        char[][] matrix = new char[size][size];

        // Populate the matrix from the input string
        int index = 0;
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++)
            {
                matrix[i][j] = input.charAt(index++);
            }
        }

        // Find paths for the substring 'find'
        List<List<String>> paths = findPaths(matrix, size, find);

        // Print the paths
        for (List<String> path : paths) 
        {
            System.out.print("Output : ");
            for (String pos : path)
            {
                System.out.print("(" + pos + ")");
            }
            System.out.println();
        }
    }

    // Function to find all paths for a given substring in the matrix
    private static List<List<String>> findPaths(char[][] matrix, int size, String find)
    {
        List<List<String>> paths = new ArrayList<>();
        int findLength = find.length();

        // Iterate through the matrix to find paths
        for (int i = 0; i <= size - findLength; i++)
        {
            for (int j = 0; j <= size - findLength; j++)
            {
                // Check substring match in the matrix starting at (i, j)
                if (checkSubstring(matrix, i, j, find))
                {
                    List<String> path = new ArrayList<>();
                    // Add positions of the substring in the format (row,col)
                    for (int k = 0; k < findLength; k++) 
                    {
                        path.add((i + k) + "," + (j + k));
                    }
                    paths.add(path);
                }
            }
        }

        return paths;
    }

    // Function to check if substring matches in the matrix starting at (row, col)
    private static boolean checkSubstring(char[][] matrix, int row, int col, String find) 
    {
        int findLength = find.length();
        // Check if substring 'find' matches starting at (row, col)
        for (int k = 0; k < findLength; k++) 
        {
            if (matrix[row + k][col + k] != find.charAt(k))
            {
                return false;
            }
        }
        return true;
    }
}

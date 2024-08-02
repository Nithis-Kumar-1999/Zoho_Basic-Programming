package zohointerviewpreparation;

import java.util.*;

public class Longest 
{

    public static List<List<Integer>> findLongestAPSubarrays(int[] arr)
    {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        // Edge case: If array length is less than 3, no valid AP subarray exists
        if (n < 3) 
        {
            return result;
        }

        int maxLength = 0;
        
        // Iterate over all possible starting points
        for (int i = 0; i <= n - 3; i++)
        {
            // Current starting element of the AP
            int start = arr[i];
            
            // Try all possible pairs (arr[i], arr[j])
            for (int j = i + 1; j < n - 1; j++)
            
            {
                int second = arr[j];
                int diff = second - start;
                
                // Check for the longest AP starting with arr[i] and arr[j]
                List<Integer> currentAP = new ArrayList<>();
                currentAP.add(start);
                currentAP.add(second);
                
                // Continue to find the rest of the AP
                for (int k = j + 1; k < n; k++)
                {
                    if (arr[k] == currentAP.get(currentAP.size() - 1) + diff) 
                    {
                        currentAP.add(arr[k]);
                    }
                }
                
                // Check if currentAP is valid and longer than previously found
                if (currentAP.size() >= 3) 
                {
                    if (currentAP.size() > maxLength) 
                    {
                        maxLength = currentAP.size();
                        result.clear();
                        result.add(new ArrayList<>(currentAP));
                    } else if (currentAP.size() == maxLength) 
                    {
                        result.add(new ArrayList<>(currentAP));
                    }
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) 
    {
        int[] arr1 = {1, 3, 5, 8, 12, 15, 18};
        int[] arr2 = {1, 3, 5, 6, 7, 9, 12, 15, 18};

        List<List<Integer>> result1 = findLongestAPSubarrays(arr1);
        List<List<Integer>> result2 = findLongestAPSubarrays(arr2);

        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + result1);

        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Output: " + result2);
    }
}

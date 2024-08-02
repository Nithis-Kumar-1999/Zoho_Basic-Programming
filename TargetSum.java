package zohointerviewpreparation;
import java.util.Arrays;
public class TargetSum 
{
	    public static int[] findTwoSum(int[] nums, int target)
	    {
	        Arrays.sort(nums);
	        
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) 
	        {
	            int sum = nums[left] + nums[right];
	            if (sum == target)
	            {
	                return new int[]{left, right};
	            } else if (sum < target) 
	            {
	                left++;
	            } else 
	            {
	                right--;
	            }
	        }       
	        return new int[0];
	    }

	    public static void main(String[] args) 
	    {
	        int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        int[] indices = findTwoSum(nums, target);
	        if (indices.length == 2) 
	        {
	            System.out.println("Indices: " + indices[0] + ", " + indices[1]);
	            System.out.println("Values: " + nums[indices[0]] + ", " + nums[indices[1]]);
	        } else 
	        {
	            System.out.println("No solution found.");
	        }
	    }
	
}

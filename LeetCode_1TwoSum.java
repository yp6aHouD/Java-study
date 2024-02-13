import static java.lang.System.out;

public class LeetCode_1TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            for (int j = i + 1; j < nums.length; j++)
            {
                if (diff == nums[j])
                {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] first = new int[]{1, 4, 5, 7, 10};
        int[] result = new LeetCode_1TwoSum().twoSum(first, 12);
        
        for (int i = 0; i < result.length; i++)
        {
            out.print(result[i] + " ");
        }
    }
}


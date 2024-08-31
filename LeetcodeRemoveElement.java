import static java.lang.System.*;


public class LeetcodeRemoveElement
{
    public static void main(String[] args)
    {
        int[] ArrayOfNumbers = {3, 2, 2, 3};
        Solution sol = new Solution();
        out.println(sol.removeElement(ArrayOfNumbers, 3));
        for (int num : ArrayOfNumbers)
        {
            out.print(num + " ");
        }
        out.println();
    }
}

class Solution
{
    public int removeElement(int[] nums, int val)
    {
        if (null == nums) return -1;

        int answer = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val) answer++;
        }
        
        for (int i = 0; i < nums.length; i++)
        {
            int j = 0, k = 0;
            if (nums[i] == val)
            {
                if (i == answer) return answer;
                k = j = i;
                while (nums[i] == val) i++;
                while (j != nums.length && i != nums.length)
                {
                    nums[j++] = nums[i++];
                }
                i = k;
            }
        }
        return answer;
    }
}
import static java.lang.System.out;

public class LeetCode_3LengthOfLongestSubstring
{
    public static int lengthOfLongestSubstring(String s)
    {
        char[] charArr = new char[s.length()]; // initializing and converting
        charArr = s.toCharArray();             // string to char array
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        int result = 1, startPos = 0, max = 0;
        
        for (int i = 1; i < s.length(); i++)
        {
            for (int j = startPos; j < i; j++)
            {
                if (charArr[i] == charArr[j])
                {
                    startPos = j + 1;
                    i = startPos - 1;
                    if (result > max)
                    {
                        max = result;
                    };
                    result = 0;
                    break;
                }
            }
            if (startPos == i) continue;
            result++;
        }
        return result > max ? result : max;
    }
    public static void main(String[] args)
    {
        String check = " 234456789";
        out.println(lengthOfLongestSubstring(check));
    }
}
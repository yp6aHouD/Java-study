import static java.lang.System.out;
import java.math.BigInteger;

public class LeetCode_2AddTwoNumbers
{
    static class ListNode // объявление связного списка
    {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val)
        {
            this.val = val;
        }

        ListNode(int val, ListNode next)
        {
            this.val = val; this.next = next;
        }
    }
    
    class Solution
    {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
        {
            if (l1 == null || l2 == null)
            {
                return null;
            }

            ListNode f1 = l1, f2 = l2, answer = new ListNode(), f3;
            String first_number = new String();
            String second_number = new String();
            String third_number;

            while(true)
            {
                first_number = first_number + f1.val;
                if (f1.next != null)
                {
                    f1 = f1.next;
                }
                else break;
            }

            while (true)
            {
                second_number = second_number + f2.val;
                if (f2.next != null)
                {
                    f2 = f2.next;
                }
                else break;
            }

            StringBuilder sb1 = new StringBuilder(first_number);
            StringBuilder sb2 = new StringBuilder(second_number);
            first_number = sb1.reverse().toString();
            second_number = sb2.reverse().toString();
            BigInteger n1 = new BigInteger(first_number);
            BigInteger n2 = new BigInteger(second_number);
            BigInteger n3 = n1.add(n2);
        
            third_number = n3.toString();
            StringBuilder sb3 = new StringBuilder(third_number);
            third_number = sb3.reverse().toString();

            f3 = answer;
            for (char c : third_number.toCharArray())
            {
                f3.next = new ListNode(Character.getNumericValue(c));
                f3 = f3.next;
            }
            return answer.next;
        }
    }

    public static void main(String[] args)
    {
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode (9, new ListNode (9, new ListNode(9, new ListNode (9, new ListNode (9))))))))));
        ListNode l1 = new ListNode(9);
        ListNode l3 = Solution.addTwoNumbers(l1, l2);
        
        while(true)
        {
            if (l3.next == null)
            {
                out.println(l3.val);
                break;
            }
            out.println(l3.val);
            l3 = l3.next;
        }
    }
}
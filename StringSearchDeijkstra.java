public class StringSearchDeijkstra 
{
    public static void main(String[] args)
    {
        String x = "Herlrld, world!";
        String y = "rlo";
        int z;
        z = StringSearching(x, y);
        System.out.println("String is located at " + z);
    }   
    
    static int StringSearching(String sourceStr, String searchStr) {
        if (sourceStr == null || searchStr == null)
            return -1;

        char[] s = sourceStr.toCharArray();
        char[] p = searchStr.toCharArray();

        int i = 0, j = 0;
        while((i <= s.length - p.length) && (j < p.length))
        {
            if (s[i+j] == p[j]) j++;
            else
            {
                i++;
                j=0;
            }
            if (j == p.length) return i;
            if (i > s.length - p.length) return -1;
        }
        return i;
    }
    
    
}

public class StringSearchBoolMethod 
{
    public static void main(String[] args)
    {
        String x = "Herlrld, world!";
        String y = "rld";
        int z;
        z = StringSearching(x, y);
        System.out.println("String is located at " + z);
    }    

    static int StringSearching(String sourceStr, String searchStr)
    {
        if (sourceStr == null || searchStr == null)
            return 0;
            
        int i = 0;
        while((i <= sourceStr.length() - searchStr.length()) && !R(i, sourceStr, searchStr))
        {
            i++;
        }
        return i;
    }
    
    /* 
     * Проверка, находится ли искомый текст
     * На позиции i.
     * Возвращается ответ да / нет
     */
    static boolean R(int i, String sourceStr, String searchStr)
    {
        if (sourceStr == null || searchStr == null)
            return false;

        char[] s = sourceStr.toCharArray();
        char[] p = searchStr.toCharArray();

        int j = 0;
        while(j < p.length && (p[j] == s[i+j]))
        {
            j++;
        }
        return !(j < p.length);
    }
}

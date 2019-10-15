public class StringCompare
{
    public static void StringCompare()
    {
        String word1 = "catalog";
        String word2 = "cat";

        int result1 = word1.compareTo("aaa");

        if(result1 > 0)
        {
            System.out.println("Condition 1 is true");
        }

        if(word1.equals(word2))
        {
            System.out.println("Condition 2 is true");
        }

        int result3 = word1.compareTo(word2);

        if(result3<0)
        {
            System.out.println("Condition 3 is true");
        }

        String w1 = word1.substring(0, 3);
        String w2 = word2.substring(0, 3);

        if(w1.equals(w2))
        {
            System.out.println("Condition 4 is true");
        }

    }
}
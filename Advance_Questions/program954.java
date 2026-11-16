import java.util.*;

//Run->java program951.java programming
class program954
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid number of argument");
            return;
        }

        String str = A[0];

        LinkedHashMap <Character, Integer> frequency = new LinkedHashMap <Character, Integer>();

        for(char ch : str.toCharArray())
        {
            frequency.put(ch,(frequency.getOrDefault(ch,0) + 1));
        }

        for(Map.Entry<Character,Integer> eobj : frequency.entrySet())
        {
            if(frequency.get(ch) == 1)
            {
                System.out.println("First non-repeating character : "+eobj.getValue());  //$
            }
           
        }
    }
}
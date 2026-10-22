import java.util.*;

class program738
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        
        String Tokens[] = str.split(" ");

        System.out.println("No of words : "+Tokens.length);

        int iMax = 0;
        String temp = null;

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() >= iMax)  
            {
                iMax = Tokens[i].length();
                temp = Tokens[i];
            }
        }

        System.out.println("All words with maximum length :  ");

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() == iMax)
            {
                System.out.println(Tokens[i]);
            }
        }

    }
}
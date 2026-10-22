import java.util.*;

class program735
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

        for(int i = 0; i < Tokens.length; i++)
        {
             System.out.println(Tokens[i]+" length "+Tokens[i].length());
        }
    }
}
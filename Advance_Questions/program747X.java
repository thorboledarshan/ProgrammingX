// Input : my name is amit
// Output : ym eman si tima

import java.util.*;

class program747
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer Finalstr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);

            sb = sb.reverse();

            Finalstr = Finalstr.append(sb);   //appends words
            Finalstr = Finalstr.append(" ");
        } 

        String Output = new String(Finalstr);

        Output = Output.trim();

        System.out.println(Output);

    }
}
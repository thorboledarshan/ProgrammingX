// automorphic number 5: 5^2 = 25  (last digit is same as given number)
import java.io.*;

class program828
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
        int iCount = 0;
        int iSquare = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iNo = Integer.parseInt(bobj.readLine());

        String strNo = String.valueOf(iNo);  //number to string converstion

        iCount = strNo.length();

        iSquare = iNo * iNo;

        String strSquare = String.valueOf(iSquare);

        if(strSquare.endsWith(strNo))
        {
            System.out.println("It is automorphic number");
        }
        else 
        {
            System.out.println("It is not automorphic number");
        }


    }
}
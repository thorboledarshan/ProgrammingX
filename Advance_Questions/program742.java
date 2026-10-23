// Input : my name is amit
//Output : My Name Is Amit  (camel case)

// Input : my NAME is Amit
// Output : My Name Is Amit  

import java.util.*;

class program742
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                if(Arr[i+1] >= 'a' && Arr[i+1] <='z')
                {
                    Arr[i+1] = (char)(Arr[i+1] - 32);  //logic of camel case
                }
                   
            }
        }

        String Output = new String(Arr);
        System.out.println("Updated String is : "+Output);


    }
}
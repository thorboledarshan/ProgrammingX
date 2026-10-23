// Input : my name is amit
//Output : My Name Is Amit  (camel case)

// Input : my NAME is Amit
// Output : My Name Is Amit  

import java.util.*;

class program743
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray(); //string to char Array conversion

        if(Arr[0] >= 'a' && Arr[0] <='z')//this is only specific for 1st word
        {
            Arr[0] = (char)(Arr[0] - 32); 
        }

        for(int i = 0; i < Arr.length; i++)//all remaing words except first word
        {
            if(Arr[i] == ' ')
            {
                if(Arr[i+1] >= 'a' && Arr[i+1] <='z')
                {
                    Arr[i+1] = (char)(Arr[i+1] - 32);  //logic of camel case
                }     
            }
        }

        String Output = new String(Arr); //Array to string conversion

        System.out.println("Updated String is : "+Output);


    }
}
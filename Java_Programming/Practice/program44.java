//Type 2

import java.util.Scanner;

class NumberX
{
  public static boolean CheckDivisbile(int iNo)
    {
         if((iNo %3 == 0) && (iNo %5 == 0))
        {
          return true;
        }
        else
        {
            return false;
        }
    }
}
class program44
{

    
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number:");
        iValue = sobj.nextInt();

       bRet =NumberX.CheckDivisbile(iValue);

       if(bRet == true)
       {
        System.out.println("Number is divisible by 3&5");
       }
       else
       {
         System.out.println("Number is  not divisible by 3&5");
       }

    }
}
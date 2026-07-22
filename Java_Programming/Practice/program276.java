import java.util.*;

class program276
{
    public static void main(String A[])
    {
      Scanner sobj = new Scanner(System.in);
      String data = null;
      StringX strobj = new StringX();   //Error
      

      System.out.println("Enter String : ");
      data = sobj.nextLine();
      
      int iRet = 0;

      iRet = strobj.CountCapital(data);
      System.out.println("Count of capital letter is : "+iRet);

      iRet = strobj.CountSmall(data);
      System.out.println("Count of small  letter is : "+iRet);

      iRet = strobj.CountDigits(data);
      System.out.println("Count of digit are : "+iRet);

      iRet = strobj.CountSpace(data);
      System.out.println("Number of  Spaces  are : "+iRet);

      iRet = strobj.CountSpecial(data);
      System.out.println("Number of Special symbols  are : "+iRet);

    }
}
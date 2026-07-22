import java.util.*;

class StringX
{
  public int CountCapital(String str)
  {
    int iCount = 0;
    int i = 0;
    char Arr[] = str.toCharArray();

    for(i = 0; i < Arr.length; i++)
    {
      if(Arr[i] >= 'A' && Arr[i] <= 'Z')
      {
        iCount++;
      }
    }
    return iCount;
  }

  public int CountSmall(String str)
  {
    int iCount = 0;
    int i = 0;

    char Arr[] = str.toCharArray();

    for(i = 0; i < Arr.length; i++)
    {
      if(Arr[i] >= 'a' && Arr[i] <= 'z')
      {
        iCount++;
      }
    }
    return iCount;
  }

  public int CountDigits(String str)
  {
    int iCount = 0;
    int i = 0;

    char Arr[] = str.toCharArray();

    for(i = 0; i < Arr.length; i++)
    {
      if(Arr[i] >= '0' && Arr[i] <= '9')
      {
        iCount++;
      }
    }
    return iCount;
  }
}
class program273
{
    public static void main(String A[])
    {
      Scanner sobj = new Scanner(System.in);
      String data = null;
      StringX strobj = new StringX();
      

      System.out.println("Enter String : ");
      data = sobj.nextLine();
      
      int iRet = 0;

      iRet = strobj.CountCapital(data);
      System.out.println("Count of capital letter is : "+iRet);

      iRet = strobj.CountSmall(data);
      System.out.println("Count of small  letter is : "+iRet);

      iRet = strobj.CountDigits(data);
      System.out.println("Count of digit are : "+iRet);

    }
}
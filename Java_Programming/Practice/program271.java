import java.util.*;

class StringX
{
  public int CountCapital(String str)
  {
    int iCount = 0;
    int i = 0;

    for(i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
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

    for(i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
      {
        iCount++;
      }
    }
    return iCount;
  }
}
class program271
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

    }
}
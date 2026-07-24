import java.util.*;

class StringX
{
  public String toUpperX(String str)
  {
    int i = 0;
    char Arr[] = str.toCharArray();

    for(i = 0; i < Arr.length; i++)
    {
       Arr[i] = (char)(Arr[i] - 32);  //ISSUE
    }
    
    return new String(Arr);     

  }
}
class program285
{
    public static void main(String A[])
    {
      Scanner sobj = new Scanner(System.in);
      String data = null;
      String sRet = null;
      StringX strobj = new StringX();
      

      System.out.println("Enter String : ");
      data = sobj.nextLine();

      sRet = strobj.toUpperX(data);
      System.out.println("Updated string is : "+sRet);



    }
}



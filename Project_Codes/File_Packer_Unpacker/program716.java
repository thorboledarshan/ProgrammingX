import java.util.*;

class StringX
{
  int CountWords(String str)
  {
    str = str.trim();

    str = str.replaceAll("\\s+"," ");

    String Tokens[]= str.split(" ");

    return Tokens.length;
  }

  void DisplayWords(String str)
  {
    str = str.trim();

    str = str.replaceAll("\\s+"," ");

    String Tokens[]= str.split(" ");

    for(int i = 0; i < Tokens.length; i++)
    {
      System.out.println(Tokens[i]+" : "+Tokens[i].length());
    }

  }

  void LargestWord(String str)
  {
    str = str.trim();

    str = str.replaceAll("\\s+"," ");

    String Tokens[]= str.split(" ");

    int iMax = 0;

    for(int i = 0; i < Tokens.length; i++)
    {

      if(Tokens[i].length() > iMax)
      {
        iMax = Tokens[i].length();
      }
    }

    System.out.println("Largest word length is : "+iMax);

  }

}

class program716
{
    public static void main(String A[]) 
    {
      Scanner sobj = new Scanner(System.in);

      int iRet = 0;

      StringX strobj = new StringX();

      String str = null;

      System.out.println("Enter String : ");
      str = sobj.nextLine();

      strobj.LargestWord(str);
 
    }
}
import java.util.*;

class DigitX
{
    public void DisplaydDigits(int iNo)
    {
        int iDigit=0;

        for(;iNo !=0;iNo = iNo /10)
        {
            iDigit = iNo % 10 ; //751
            System.out.println(iDigit); //prints 1
        }
        
    }
    


}

class program82
{
    public static Void main (String A[])
    {
      Scanner sobj = new Scanner(System.in);
      DigitX dobj = new DigitX();
      
      int iValue = 0;
      System.out.println("Enter Number:");
      iValue = sobj.nextInt();

      dobj.DisplaydDigits(iValue);

    }
}
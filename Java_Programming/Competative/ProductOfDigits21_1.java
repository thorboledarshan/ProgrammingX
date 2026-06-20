///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. calculate product of digits of number
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void ProductOfDigits(int num)
    {
        int iProduct = 1;
        int iDigit = 0;
        while(num != 0)
        {
            iDigit = num % 10;
            iProduct = iProduct * iDigit;
            num = num / 10 ;
        }
        System.out.println("Product of  number is : "+iProduct);
      
    }
}


class ProductOfDigits21_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.ProductOfDigits(123);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 123
// ouput : product of   number is : 6
//
///////////////////////////////////////////////////////////////////////////////////////////////
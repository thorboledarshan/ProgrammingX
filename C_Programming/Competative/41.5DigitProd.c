#include<stdio.h>

int DigitProduct(int iNo)
{
    static int iProd = 1;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iProd = iDigit * iProd;
        DigitProduct(iNo / 10);
    }
    return iProd;
    
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = DigitProduct(iValue);
    printf("Product is : %d\n",iRet);

    return 0;
}


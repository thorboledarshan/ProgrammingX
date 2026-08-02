#include<stdio.h>

int DigitSum(int iNo)
{
    static int iSum = 0;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iSum = iDigit + iSum;
        DigitSum(iNo / 10);
    }
    return iSum;
    
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = DigitSum(iValue);
    printf("Sum is : %d\n",iRet);

    return 0;
}

// Sum
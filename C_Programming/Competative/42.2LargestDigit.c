#include<stdio.h>

int LargestDigit(int iNo)
{
    static int iMax = 0;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit > iMax)
        {
            iMax = iDigit;
        }
        LargestDigit(iNo / 10);
    }
    return iMax;
    
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = LargestDigit(iValue);
    printf("Largest digit is : %d\n",iRet);

    return 0;
}


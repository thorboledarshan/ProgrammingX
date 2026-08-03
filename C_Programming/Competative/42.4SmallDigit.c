#include<stdio.h>

int SmallDigit(int iNo)
{
    static int iMin = 9;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit < iMin)
        {
            iMin = iDigit;
        }
        SmallDigit(iNo / 10);
    }
    return iMin;
    
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = SmallDigit(iValue);
    printf("Smallest digit is : %d\n",iRet);

    return 0;
}


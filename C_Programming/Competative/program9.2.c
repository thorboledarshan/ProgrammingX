//////////////////////////////////////////////////////////////////////////////////////
//
// Q. write a program which accept number from user and return the count of odd digit
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int CountOddDigits(int iNo)
{
    int iCnt = 0;
    int iDigit = 0;
    int iCount = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo !=0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10;
        if(iDigit % 2 != 0)
        {
            iCount = iCount + 1;
        }
    }
    return iCount;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = CountOddDigits(iValue);
    printf("odd Digits are : %d",iRet);
    return 0;
}

//////////////////////////////////////
//
// input : 2395
// output: 3
//
//////////////////////////////////////
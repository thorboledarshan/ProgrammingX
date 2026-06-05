//////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept number from user and return difference between
//    summation of even digits and summation of odd digits..
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int CountDiff(int iNo)
{
    int iCnt = 0;
    int iDigit = 0;
    int iCountOdd = 0;
    int iCountEven = 0;
    int iDiff = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo !=0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10;
        if(iDigit % 2 == 0)
        {
            iCountEven = iCountEven + iDigit;
        }
        else
        {
            iCountOdd = iCountOdd + iDigit;
        }

    }
    iDiff = iCountEven - iCountOdd;
    return iDiff;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);
    printf("Count Difference is  : %d",iRet);
    return 0;
}

//////////////////////////////////////
//
// input : 2395
// output: -15(2 - 17)
//
//////////////////////////////////////
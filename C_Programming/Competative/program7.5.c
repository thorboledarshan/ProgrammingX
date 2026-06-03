//////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which returns difference between even and odd factorial of 
//    a given number .
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int FactorialDiff(int iNo)
{
    int iCnt = 0;
    int iFact1 = 1;
    int iFact2 = 1;
    int iDiff = 0;
    if(iNo < 0 )
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if(iCnt % 2 ==0)
        {
         iFact1 = iFact1 * iCnt;
        }
        else
        {
            iFact2 = iFact2 * iCnt; 
        }
            
    }
    iDiff = iFact1 - iFact2;
    return iDiff;
}
int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter number:");
    scanf("%d",&iValue);
    iRet = FactorialDiff(iValue);
    printf("factorial difference  is: %d\n",iRet);
    return 0;
}

//////////////////////////////////////
//
// input : -5
// output: -7 (8 - 15)
//
//////////////////////////////////////
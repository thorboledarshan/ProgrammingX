//////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program to find even factorial of number 
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int EvenFactorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;
    if(iNo < 0 )
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if(iCnt % 2 ==0)
        {
         iFact = iFact * iCnt;
        }
            
    }
    return iFact;
}
int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter number:");
    scanf("%d",&iValue);
    iRet = EvenFactorial(iValue);
    printf("Even factorial of number is: %d\n",iRet);
    return 0;
}

//////////////////////////////////////
//
// input : 5
// output: 8 (4 * 2)
//
//////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept range from user and return addition of all numbers in 
//   between that range.(Range should contain only positive numbers) 
//
//////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void RangeDisplayEven(int iStart, int iEnd)
{
    int iCnt = 0;
    int iSum = 0;
    if((iStart > iEnd) || (iStart < 0) || (iEnd < 0))
    {
        printf("Invalid Input");
        return;
    }
    
    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iSum = iSum + iCnt;
    }
    printf("%d",iSum);
}
int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter Starting point:");
    scanf("%d",&iValue1);
    printf("Enter ending point:");
    scanf("%d",&iValue2);

    RangeDisplayEven(iValue1,iValue2);
    return 0;
}

//////////////////////////////////////
//
// input : 23 30
// output: 212
//
//////////////////////////////////////
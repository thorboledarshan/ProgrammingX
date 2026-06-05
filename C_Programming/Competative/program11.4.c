////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept range from user and display all addition of even numbers in
//   between that range 
//
////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void RangeSumEven(int iStart, int iEnd)
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
        if(iCnt % 2 ==0)
        {
          iSum = iSum + iCnt;
        }
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

    RangeSumEven(iValue1,iValue2);
    return 0;
}

//////////////////////////////////////
//
// input : 10 18
// output: 70
//
//////////////////////////////////////
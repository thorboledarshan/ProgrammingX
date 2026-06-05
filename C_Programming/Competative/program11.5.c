////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept range from user and display all  numbers in
//   between that rangein reverse order.
//
////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void RangeDisplayRev(int iStart, int iEnd)
{
    int iCnt = 0;

    if(iStart > iEnd)
    {
        printf("Invalid Input");
        return;
    }
    for(iCnt = iEnd; iCnt >= iStart; iCnt--)
    {
        printf("%d ",iCnt);
    }
}
int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter Starting point:");
    scanf("%d",&iValue1);
    printf("Enter ending point:");
    scanf("%d",&iValue2);

    RangeDisplayRev(iValue1,iValue2);
    return 0;
}

//////////////////////////////////////
//
// input : 10 18
// output: 70
//
//////////////////////////////////////
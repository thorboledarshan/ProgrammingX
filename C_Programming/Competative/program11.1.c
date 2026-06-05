//////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept range from user and display all numbers in between 
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int RangeDisplay(int iStart, int iEnd)
{
    int iCnt = 0;
    if(iStart > iEnd)
    {
        printf("Invalid Input");
    }
    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
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

    RangeDisplay(iValue1,iValue2);
    return 0;
}

//////////////////////////////////////////////
//
// input : 10 20
// output: 10 11 12 13 14 15 16 17 18 19 20
//
/////////////////////////////////////////////
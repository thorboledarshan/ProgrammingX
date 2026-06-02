////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept number from user  and print number  till    
//   that number
//
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    if(iNo < 0 )
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%d ",iCnt);
    }
}
int main()
{
    int iValue = 0;
    printf("Enter number:");
    scanf("%d",&iValue);
    Display(iValue);
    return 0;
}

////////////////////////////
//
// input : 8
// output: 1 2 3 4 5 6 7 8
//
///////////////////////////
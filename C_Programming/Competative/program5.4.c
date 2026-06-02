////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept N from user  and print all odd numbers     
//   upto N
//
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    for( iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if( iCnt % 2 !=0)
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

//////////////////////////////////
//
// input : 18
// output: 1 3 5 7 9 11 13 15 17
//
/////////////////////////////////
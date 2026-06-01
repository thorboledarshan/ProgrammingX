////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept number from user  and display  its
//   all non-factors
//
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void NonFact(int iNo)
{
    int iCnt = 0;
    for(iCnt =1 ;iCnt <= iNo; iCnt++)
    {
        if(iNo % iCnt != 0)
        {
          printf("%d ",iCnt);
        }
    }
    
}
int main()
{
    int iValue=0;

    printf("Enter number: ");
    scanf("%d",&iValue);

    NonFact(iValue);
    return 0;
}

///////////////////////////
//
// input : 12
// output: 5 7 8 9 10 11
//
/////////////////////////
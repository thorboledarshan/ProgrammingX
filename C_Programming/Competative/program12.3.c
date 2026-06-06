////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept number from user and count frequency of 2 in it
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int CountTwo(int iNo)
{
    int iDigit = 0;
    int iFreq = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo !=0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10 ;
        if(iDigit == 2)
        {
            iFreq = iFreq + 1;
        }
    }
    return iFreq;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);
    iRet = CountTwo(iValue);
    printf("Frequency of Two is: %d",iRet);
    return 0;
}

//////////////////////////////////////
//
// input : 267427
// output: 2
//
//////////////////////////////////////



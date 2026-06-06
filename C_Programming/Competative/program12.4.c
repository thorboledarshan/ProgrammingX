////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept number from user and count frequency of 4 in it
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int CountFour(int iNo)
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
        if(iDigit == 4)
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
    iRet = CountFour(iValue);
    printf("Frequency of Four is: %d",iRet);
    return 0;
}

//////////////////////////////////////
//
// input : 87873449847
// output: 3
//
//////////////////////////////////////



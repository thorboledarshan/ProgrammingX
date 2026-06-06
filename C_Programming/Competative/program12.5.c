////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept number from user and count frequency of such a digits 
//    which are less than 6.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int CountFreqDigit(int iNo)
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
        if(iDigit < 6 )
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

    iRet = CountFreqDigit(iValue);
    printf("%d ",iRet);
    return 0;
}

//////////////////////////////////////
//
// input : 1018
// output: 3
//
//////////////////////////////////////



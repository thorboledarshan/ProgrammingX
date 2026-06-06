/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept number from user and check whether it contains zero or not
//
////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckZero(int iNo)
{
    int iDigit = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo !=0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10 ;
        if(iDigit == 0)
        {
            return TRUE;
        }
    }
    return FALSE;
}
int main()
{
    int iValue=0;
    BOOL bRet=FALSE;

    printf("Enter Number:");
    scanf("%d",&iValue);

    bRet=CheckZero(iValue);

    if(bRet==TRUE)
    {
      printf("It contains zero \n");
    }
    else
    {
        printf("It do not contain zero \n");
    }
    return 0;
}

///////////////////////////////
//
// input : 1023
// output: It contains Zero
//
/////////////////////////////


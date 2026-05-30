////////////////////////////////////////////////////////////////////////
//
// Q.Accept number from user  and check whether number is even or odd
////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckEven(int iNo)
{
    int i=0;
    if(iNo % 2==0)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}
int main()
{
    int iValue=0;
    BOOL bRet=FALSE;

    printf("Enter Number:");
    scanf("%d",&iValue);

    bRet=CheckEven(iValue);

    if(bRet==TRUE)
    {
      printf("Number is Even \n");
    }
    else
    {
        printf("Number is Odd \n");
    }
    return 0;
}

///////////////////////////
//
// input : 10
// output: Even
//
/////////////////////////
#include<stdio.h>

int CheckEvenOdd(int iNo)
{
    int iReminder=0;
    iReminder = iNo % 2;
    return iReminder;
}

int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter Number to check whether it is odd or even:\n");
    scanf("%d",&iValue);

    iRet = CheckEvenOdd(iValue);

    if(iRet ==0)
    {
        printf("%d is even number\n",iValue);
    }
    else
    {
      printf("%d is odd number \n",iValue);
    }
    return 0;
}
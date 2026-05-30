////////////////////////////////////////////////////////////////////////
//
// Q.write a program whcich accept one number from user and print that 
//   number of even numbers on screen
// 
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void PrintEven(int iNo)
{
    if(iNo<=0)
    {
        return;
    }

    int iCnt = 0;
    for (iCnt=1;iCnt<=iNo;iCnt++)
    {
        printf("%d ",iCnt*2); //logic
    }
}
int main()
{
    int iValue=0;
    printf("Enter Number:\n");
    scanf("%d",&iValue);

    PrintEven(iValue);
    return 0;
}


///////////////////////////
//
// input : 7
// output: 2 4 6 8 10 12 14 
//
/////////////////////////
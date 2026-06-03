//////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept number from user and display its table
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    int iFact = 1;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= 10; iCnt++)
    {
        iFact = iNo * iCnt;
        printf("%d ",iFact);
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

//////////////////////////////////////
//
// input : 2
// output: 2 4 6 8 10 12 14 16 18 20
//
//////////////////////////////////////
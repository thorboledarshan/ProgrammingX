//////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept number from user and display below pattern
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("* ",iCnt);
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("# ",iCnt);
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
// input : 6
// output: * * * * * * # # # # # #
//
//////////////////////////////////////
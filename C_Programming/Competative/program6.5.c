//////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept number from user and display below pattern
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
    for(iCnt = 10; iCnt >=1; iCnt--)
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
// input : 3
// output: 30 27 24 21 18 15 12 9 6 3
//
//////////////////////////////////////
////////////////////////////////////////////////////////////////////////
//
// Q.Accept one number from user and print that number of (*) on screen
//
//Algorithm:
//Start
//  Accept number from user and store in variable iNo
//  Initialize counter variable iCnt = 1
//  Repeat until iCnt <= iNo
//  Print *
//  Increment iCnt++
//Stop
//
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    int iCnt=0;

    while(iCnt<iNo)
    {
        printf("*");
        iCnt++;
    }
}
int main()
{
    int iValue=0;
    printf("Enter Number:\n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}

///////////////////////
//
// input : 4
// output: * * * * 
//
///////////////////////
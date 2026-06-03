//////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept amount in US dollar and return its corresponding value in Indian Currency 
//    conside 1$ = 70 rupees.
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    int iRupee = 0;
    iRupee = iNo * 70;
    printf("Amount in Indian Currency is: %d\n",iRupee);
}
int main()
{
    int iValue = 0;
    printf("Enter Amount in $:");
    scanf("%d",&iValue);
    Display(iValue);
    return 0;
}

//////////////////////////////////////
//
// input : 10
// output: 700
//
//////////////////////////////////////



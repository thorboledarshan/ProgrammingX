//////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept number from user and if number is less than 50
//    then print small , if it is greater than 50 and less than 100 then print medium, if it is
//    greater than 100 then print large.
//
/////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    
    for( iCnt = 1; iCnt <= 5; iCnt++)
    {
        {
         printf("%d ",iNo*iCnt);
        }
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

//////////////////////////////////
//
// input : 18
// output: 1 3 5 7 9 11 13 15 17
//
/////////////////////////////////
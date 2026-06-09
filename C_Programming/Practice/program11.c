/*
   Start
        Accept a number from user as No
        If No is  completely divisible by 2
        then print "Even"
        else print "Odd"
    Stop

    Start
         Accept a number as No
         divide No by 2
         if reminder is 0
         then print "Even"
         else print "Odd"
    Stop
*/

#include<stdio.h>
int main()
{
    int iValue=0;
    int iReminder=0;

    printf("Enter Number:\n");
    scanf("%d",&iValue);

    iReminder=iValue % 2;
    if(iReminder==0)
    {
        printf("Number is Even \n");
    }
    else
    {
        printf("Number is Odd \n");
    }
    return 0;
}
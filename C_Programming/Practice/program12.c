#include<stdio.h>

void CheckEvenOdd(int iNo)
{
  int iReminder=0;
  iReminder = iNo % 2;
  if(iReminder == 0)
  {
    printf("Even number");
  }
  else
  {
    printf("Odd number");
  }
}

int main()
{
    int iValue =0;
    printf("Enter Number:\n");
    scanf("%d",&iValue);

    CheckEvenOdd(iValue);
    return 0;
}
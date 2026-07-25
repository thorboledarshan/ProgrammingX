#include<stdio.h>

void strrevX(char *str)
{
  
}

int main()
{
  int i = 11;
  int j = 21;
  int iTemp = 0;
  
  iTemp = i;
  i = j;
  j = iTemp;

  printf("%d\n",i);
  printf("%d\n",j);
  return 0;
}
#include<stdio.h>

//call by Address
void Swap(int *ptr1, int *ptr2)
{
  int iTemp = 0;
  
  iTemp = *ptr1;
  *ptr1 = *ptr2;
  *ptr2 = iTemp;
}

int main()
{
  int i = 11;
  int j = 21;

  Swap(&i,&j);
  
  printf("%d\n",i);
  printf("%d\n",j);
  return 0;
}
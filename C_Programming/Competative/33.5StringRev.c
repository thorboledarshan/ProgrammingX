/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept string from user and reverse that string.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void StrRevX(char *str)
{
  char *start = NULL;
  char *end = NULL;
  int iTemp = 0;
  start = str;


  while(*str != '\0')
  { 
    str++;
  }
  str--;
  end = str;

  while(start <= end)
  { 
    iTemp = *start;
    *start = *end;
    *end = iTemp;
    start++;
    end--;
  }
  printf("\n");

}
int main()
{
  char Arr[50] = {'\0'};

  printf("Enter String :\n");
  scanf("%[^'\n']s",Arr);

  StrRevX(Arr);
  printf("Updated string is : %s\n",Arr);

  return 0;
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan , a
// ouput : Updated string is : nahsraD
//
///////////////////////////////////////////////////////////////////////////////////////////////
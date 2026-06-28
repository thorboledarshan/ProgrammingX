/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept string from user and accept one character . check whether it is
//   present or not.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL ChkCharacter(char *str , char ch)
{
  while(*str != '\0')
  {
    if(*str == ch)
    {
      return TRUE;
    }
    str++;
  }
  return FALSE;
}
int main()
{
  char Arr[50] = {'\0'};
  char cValue = '\0';
  BOOL bRet = FALSE;
  

  printf("Enter String :\n");
  scanf("%[^'\n']s",Arr);

  printf("Enter Character to check :\n");
  scanf(" %c",&cValue);

  bRet = ChkCharacter(Arr,cValue);

  if(bRet == TRUE)
  {
    printf("Character is present in given String \n ");
  }
  else 
  {
    printf("Character is not  present in given String \n");
  }

  return 0;
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan , a
// ouput : Character is present in given string
//
///////////////////////////////////////////////////////////////////////////////////////////////
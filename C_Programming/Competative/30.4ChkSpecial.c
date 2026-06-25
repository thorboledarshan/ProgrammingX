///////////////////////////////////////////////////////////////////////////////////////////////
//
/*  Accept character from user. and check whether it is special symbol or not.
*/
//
///////////////////////////////////////////////////////////////////////////////////////////////


#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL ChkSpecial(char cCh)
{
  if(cCh == '!' || cCh == '@' || cCh == '#' || cCh == '&' || cCh == '*' || cCh == '^' || cCh == '$')
  {
    return TRUE;
  }
  else 
  {
    return FALSE;
  }
}

int main()
{
   char cValue = '\0';
   BOOL bRet = FALSE;

   printf("Enter Character : ");
   scanf("%c",&cValue);

    bRet = ChkSpecial(cValue);
    if(bRet == TRUE)
    {
      printf("It is special symbol \n");
    }
    else 
    {
      printf("It is not special symbol");
    }

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter Character : A
// output : a
//
///////////////////////////////////////////////////////////////////////////////////////////////
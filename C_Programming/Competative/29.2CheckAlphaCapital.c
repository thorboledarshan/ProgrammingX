///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept character from user and check wheteher alphabet is capital  or not.(A-Z,a-z)
//
///////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckAlphaCapital(char cCh)
{
  if((cCh >='A')&& (cCh <'a'))
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

    printf("Enter Alphabet : ");
    scanf("%c",&cValue);

    bRet = CheckAlphaCapital(cValue);

    if(bRet == TRUE)
    {
        printf("It is capital character ");
    }
    else
    {
        printf("It is not capital character");
    }

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter Character : Z
// output : It is capital  character
//
///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept character from user and check wheteher it is alphabet or not.(A-Z,a-z)
//
///////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckAlphabet(char cCh)
{
  if((cCh >='A')&& (cCh <='z'))
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

    bRet = CheckAlphabet(cValue);

    if(bRet == TRUE)
    {
        printf("It is character ");
    }
    else
    {
        printf("It is not character");
    }

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter Character : Z
// output : It is character
//
///////////////////////////////////////////////////////////////////////////////////////////////
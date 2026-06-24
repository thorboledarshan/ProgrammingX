///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept character from user and check wheteher it is digit   or not.(0-9)
//
///////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckDigit(char cCh)
{
  if((cCh >='0')&& (cCh <='9'))
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

    bRet = CheckDigit(cValue);

    if(bRet == TRUE)
    {
        printf("It is Digit\n");
    }
    else
    {
        printf("It is not Digit\n");
    }

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter Character : 3
// output : It is Digit
//
///////////////////////////////////////////////////////////////////////////////////////////////
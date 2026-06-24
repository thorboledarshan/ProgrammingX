///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept character from user and check wheteher it is small case or not.(a-z)
//
///////////////////////////////////////////////////////////////////////////////////////////////


#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckDigit(char cCh)
{
  if((cCh >='a')&& (cCh <='z'))
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
        printf("It is smallcase character\n");
    }
    else
    {
        printf("It is not smallcase character\n");
    }

    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter Character : z
// output : It is smallcase character
//
///////////////////////////////////////////////////////////////////////////////////////////////
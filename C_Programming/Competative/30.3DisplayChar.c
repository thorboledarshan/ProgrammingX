///////////////////////////////////////////////////////////////////////////////////////////////
//
/*  Accept character from user. If it is capital then display all the
    characters from the input characters till Z. If input character is small
    then print all the characters in reverse order till a. In other cases
    return directly.
*/
//
///////////////////////////////////////////////////////////////////////////////////////////////


#include<stdio.h>


void DisplayChar(char cCh)
{
  int iCnt = 0;
  if(cCh >= 'A' && cCh <='Z')
  {
    for(iCnt = cCh ; iCnt <='Z'; iCnt++,cCh++)
    {
      printf("%c ",cCh);
    }
  }
  else if(cCh >= 'a' && cCh <='z')
  {
    for(iCnt = cCh ; iCnt >='a'; iCnt--,cCh--)
    {
      printf("%c ",cCh);
    }
  }
  else 
  {
    return;
  }

  
}

int main()
{
   char cValue = '\0';
   printf("Enter Character : ");
   scanf("%c",&cValue);

    DisplayChar(cValue);
    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter Character : A
// output : a
//
///////////////////////////////////////////////////////////////////////////////////////////////
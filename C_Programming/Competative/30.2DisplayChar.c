///////////////////////////////////////////////////////////////////////////////////////////////
//
/* Accept character from user. If character is small display its
   corresponding capital character, and if it small then display its
   corresponding capital. In other cases display as it is.
*/
//
///////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>


void DisplayChar(char cCh)
{
  if(cCh >= 'A' && cCh <='Z')
  {
    cCh = cCh+32;
    printf("%c",cCh);
  }
  else if(cCh >= 'a' && cCh <='z')
  {
    cCh = cCh-32;
    printf("%c",cCh);
  }
  else 
  {
    printf("%c",cCh);
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
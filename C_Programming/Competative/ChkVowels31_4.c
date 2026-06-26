/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. 4. Write a program which accept string from user and check whether it contains vowels in it or not.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int Bool ;

Bool ChkVowel(char *str)
{
  int iCount = 0;
  while(*str != '\0')
  {
    if((*str == 'a' ) || (*str == 'e' ) || (*str == 'i' ) || (*str == 'o') ||(*str == 'u')) //case sensitive
    {
        iCount++;
        break;
    }
    str++;
  }
  if(iCount >= 1)
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
    char Arr[50] = {'\0'};
    Bool bRet = FALSE;

    printf("Enter String : ");
    scanf("%[^'\n']s",Arr);
    
    bRet = ChkVowel(Arr);
    if(bRet == TRUE)
    {
        printf("Vowel is present\n");
    }
    else 
    {
        printf("Vowel is not  present\n");
    }

    return 0;
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan
// ouput : Vowel is present
//
///////////////////////////////////////////////////////////////////////////////////////////////
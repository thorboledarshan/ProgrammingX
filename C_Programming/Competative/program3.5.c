////////////////////////////////////////////////////////////////////////
//
// Q.Accept one character from user and check whether that character is 
//   vowel(a,e,i,o,u) or not?
//
////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#define TRUE 1
#define FALSE 0
typedef int BOOL;

BOOL CheckVowel(char cChar)
{
    
    if(cChar=='a' || cChar=='e' || cChar=='i' || cChar=='o' || cChar=='u' 
       || cChar=='A' || cChar=='E' || cChar=='I' || cChar=='O' || cChar=='U')
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
    char cValue='\0';
    BOOL bRet=FALSE;

    printf("Enter Character: ");
    scanf("%c",&cValue);

    bRet=CheckVowel(cValue);

    if(bRet==TRUE)
    {
      printf("It is vowel");
    }
    else
    {
        printf("It is not vowel");
    }
    return 0;
}

///////////////////////////
//
// input : D
// output: It is not vowel
//
/////////////////////////
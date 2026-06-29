/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which 2 strings from user and concat second string
//   after first string. (Implement strcat() function).
/////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void strConcate(char *src, char *dest)
{

  while((*src != '\0'))
  {
    src++;
  }

  while((*dest != '\0'))
  {
    *src =  *dest ;
    dest++;
    src++;
  }
  *dest = '\0';

}

int main()
{
  char Brr[30] = {'\0'};
  char Arr[30] = {'\0'};
  
  printf("Enter String :\n");
  scanf("%[^'\n']s",Arr);

  printf("Enter String :\n");
  scanf(" %[^'\n']s",Brr);

  strConcate(Arr,Brr);
  printf("Concate string is : %s\n",Arr);

  return 0;
}


///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan Thorbole 
// ouput : Concate string is : DarshanThorbole
//
///////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept string from user and copy only small 
//   contents of that string into another string. (Implement strncpy()
//   function)
/////////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void strcpySmall(char *src, char *dest)
{
  while((*src != '\0'))
  {
    if(*src >= 'a' && *src <='z')
    {
     *dest = *src;
     dest++;
    }
    src++;
    
  }
  *dest = '\0';

}

int main()
{
  char Brr[30];
  char Arr[30] = "Marvellous Multi OS";
  
  


  printf("Enter String :\n");
  scanf("%[^'\n']s",Arr);


  strcpySmall(Arr,Brr);
  printf("Copied string is : %s\n",Brr);

  return 0;
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan Thorbole 
// ouput : Copied string is : arshanhorbole
//
///////////////////////////////////////////////////////////////////////////////////////////////
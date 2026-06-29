/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept string from user and copy the N number of 
//   contents of that string into another string. (Implement strncpy()
//   function)
/////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void strncpyX(char *src, char *dest, int iCnt)
{
  while((*src != '\0') && (iCnt != 0))
  {
    *dest = *src;
    src++;
    dest++;
    iCnt--;
  }
  *dest = '\0';

}

int main()
{
  char Brr[30];
  char Arr[30] = "Marvellous Multi OS";
  int iCounter = 0;
  


  printf("Enter String :\n");
  scanf("%[^'\n']s",Arr);

  printf("Enter count : ");
  scanf("%d",&iCounter);

  strncpyX(Arr,Brr,iCounter);
  printf("Copied string is : %s\n",Brr);

  return 0;
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan Thorbole , 7
// ouput : Copied string is : Darshan
//
///////////////////////////////////////////////////////////////////////////////////////////////
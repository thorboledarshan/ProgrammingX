#include<stdio.h>

void strrevX(char *str)
{
  char *start = NULL;
  char *end = NULL;
  int temp = 0;
  start = str;

  while(*str != '\0')
  {
    str++;
  }
  str--;
  end = str;

  while(start <= end)
  {
   temp = *start;
   *start = *end;
   *end = temp;
   start++;
   end--;         
  }
  printf("\n");
  
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    strrevX(Arr);

    printf("Updated string is : %s\n",Arr);
    return 0;
}
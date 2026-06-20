//input : 5
// output: 5 4 3 2 1
#include<stdio.h>

int main()
{
    int iNo = 751;
    int iDigit = 0;
    
    iDigit = iNo % 10;
    printf("%d\n",iDigit);
    iNo = iNo/10;

    iDigit = iNo % 10;
    printf("%d\n",iDigit);
    iNo = iNo/10;

    iDigit = iNo % 10;
    printf("%d\n",iDigit);
    iNo = iNo/10;
    
   return 0;
}
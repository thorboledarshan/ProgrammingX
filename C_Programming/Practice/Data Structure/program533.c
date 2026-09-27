#include<stdio.h>

// input : 5678
// output : 8 7 6 5
void Display(int iNo)
{
    int iDigit = 0;
    
    if(iNo != 0)
    {
        iDigit = iNo % 10;
        printf("%d\n",iDigit);
        iNo = iNo / 10;

        Display(iNo);
    }
}
int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}
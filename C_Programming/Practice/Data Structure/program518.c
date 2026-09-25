#include<stdio.h>

void Display(int iNo)
{
    
    if(iNo !=0 )
    {
        printf("Jay Ganesh... %d\n",iNo);
    
        Display(iNo--);  //ISSUE 
    }  
}

int main()
{
   int iValue = 0;

    printf("Enter Frequency : \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
////////////////////////////////////////////////////////////////////////
//
// Q.Accept one character from user and convert case of that character.
// 
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void DisplayConvert(char cValue)
{
    
    if((cValue >='A')&&(cValue<='Z'))      //Logic
    {
        printf("%c",cValue+32);                   
    }                                            
    else if ((cValue >='a')&&(cValue<='z'))      
    {
        printf("%c",cValue-32);
    }
}

int main()
{
    char cValue='\0';
    printf("Enter Character:\n");
    scanf("%c",&cValue);

    DisplayConvert(cValue);
    return 0;
}


/////////////////////////////////////////////////////////
//
// input : A          //ASCII value 
// output: a          //  A->Z=65->90  Difference=32
//                   //  a->z=97->122
// input : D
// output: d
//
// We can use inbuilt library .
//////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
//
// Q. write a program which accept temperature in fahrenheit and convert it into celsius.
//    (1celsius =(fahrenheit -32)* 5/9)
/////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

double FhtoCs(float fTemp)
{
    float fCelsius = 0.0;
    fCelsius = ((fTemp - 32) * 5/9);
    return fCelsius;
}
int main()
{
    float fValue = 0.0;
    double bRet = 0.0;

    printf("Enter temperature in Fahrenheit : ");
    scanf("%f",&fValue);

    bRet = FhtoCs(fValue);
    printf("Temperature in Celsius is: %f\n",bRet);
    return 0;
}

//////////////////////////////////////
//
// input : 34
// output: 1.11111
//
//////////////////////////////////////
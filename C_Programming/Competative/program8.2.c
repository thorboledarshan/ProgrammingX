//////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept width and height of Rectangle  from user and 
//   calculate its area. (Area of Rectangle = width * height) .    
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

double RectArea(float fWidth, float fHeight)
{
    double dArea = 0;
    dArea = fWidth * fHeight;
    return dArea;
}
int main()
{
    float fValue1 = 0.0;
    float fValue2 = 0.0;
    double dRet = 0;

    printf("Enter Width of Rectangle:");
    scanf("%f", &fValue1);
    printf("Enter height of Rectangle:");
    scanf("%f", &fValue2);

    dRet = RectArea(fValue1,fValue2);
    printf("Area of Rectangle is: %.3f\n",dRet);

    return 0;
}

//////////////////////////////////////
//
// input : 5.3 9.78
// output: 51.834
//
//////////////////////////////////////
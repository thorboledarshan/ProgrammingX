/*
write a generic program to multiply two numbers
*/

#include<iostream>

template<class T>

T Multiply(T no1, T no2)
{
    T Ans;
    Ans = no1 * no2;
    return Ans;
}

int main()
{
    int iRet = Multiply(11,22);
    printf("%d\n",iRet);

    float fRet = Multiply(11.2f,22.3f);
    printf("%f\n",fRet);
    return 0;
}
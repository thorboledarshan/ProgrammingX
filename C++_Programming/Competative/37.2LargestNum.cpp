/*
write a generic program to find largest number from 3 numbers
*/

#include<iostream>

template<class T>

T LargestNum(T no1, T no2, T no3)
{
    T Ans;
    if((no1 > no2) && (no1 > no3))
    {
    Ans =  no1;
    }
    else if((no2 > no1) && (no2 > no3))
    {
        Ans =  no2;
    }
    else 
    {
        Ans =  no3;
    }
    return Ans;
}

int main()
{
    int iRet = LargestNum(11,22,51);
    printf("The Largest number is : %d\n",iRet);

    float fRet = LargestNum(11.2f,22.3f,51.5f);
    printf("The Largest number is : %f\n",fRet);
    
    return 0;
}
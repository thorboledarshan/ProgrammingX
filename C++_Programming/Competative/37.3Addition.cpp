/*
Write generic program to accept N values from user and return addition of that values.
*/

#include<iostream>
using namespace std;

template<class T>

T AddN(T *Arr, int iSize)
{
    T Sum = 0;
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        Sum = Sum + Arr[i];
    }
    return Sum;
}

int main()
{
    int Brr[] = {10,20,30,40,50};
    float Crr[] = {10.0f,20.0f,30.5f,40.0f,50.0f};

    int iRet = AddN(Brr,5);
    printf("Addition is : %d\n",iRet);

    float fRet = AddN(Crr,5);
    printf("Addition is : %f\n",fRet);

    
    return 0;
}
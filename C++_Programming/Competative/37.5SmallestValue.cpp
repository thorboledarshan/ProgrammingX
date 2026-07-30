/*
Write generic program to accept N values from user and return max of that values.
*/

#include<iostream>
using namespace std;

template<class T>

T Min(T *Arr, int iSize)
{
    int i = 0;
    T Min = Arr[i];

    for(i = 0; i < iSize; i++)
    {
        if(Arr[i] < Min)
        {
            Min = Arr[i];
        }
    }
    return Min;
}

int main()
{
    int Brr[] = {10,5,30,40,50};
    float Crr[] = {10.0f,20.0f,30.5f,40.0f,50.0f};

    int iRet = Min(Brr,5);
    printf("Min number  is : %d\n",iRet);

    float fRet = Min(Crr,5);
    printf("Min number is : %f\n",fRet);

    
    return 0;
}
/*
Write generic program to accept N values and reverse values
*/

#include<iostream>
using namespace std;

template<class T>

void Reverse(T *Arr, int iSize)
{
    int start = 0;
    int end = iSize - 1;

    while(start < end)
    {
        T temp = Arr[start];
        Arr[start] = Arr[end];
        Arr[end] = temp;

        start++;
        end--;
    }
}

int main()
{

   int Brr[] = {10,20,30,10,10};
   Reverse(Brr,5);

   float Crr[] = {10.0f,20.0f,20.0f,40.0f,50.0f};
   Reverse(Crr,5);
   

    return 0;
}
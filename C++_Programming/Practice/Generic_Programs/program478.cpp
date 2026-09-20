#include<iostream>
using namespace std;

template <class T>

T Maximum(T No1, T No2)
{
    T Ans;
    if(No1 > No2)
    {
        Ans =  No1;
    }
    else 
    {
        Ans =  No2;
    } 
    return Ans;
}

int main()
{
    cout<<Maximum(11.5f,21.2f)<<"\n";
    cout<<Maximum(11.5,21.2)<<"\n";
    cout<<Maximum(11,21)<<"\n";
    return 0;
}
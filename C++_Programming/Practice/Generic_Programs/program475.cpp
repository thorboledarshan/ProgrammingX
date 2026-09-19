#include<iostream>
using namespace std;

float Maximum(float No1, float No2)
{
    if(No1 > No2)
    {
        return No1;
    }
    else 
    {
        return No2;
    } 
}

int main()
{
    cout<<Maximum(11.5f,21.2f)<<"\n";
    return 0;
}
#include<iostream>
using namespace std;

template <class X>

X Maximum(X No1, X No2, X No3)
{

    if(No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No1 && No2 > No3)
    {
        return No2;
    } 
    else
    {
        return No3;
    }

}

int main()
{
    cout<<Maximum(11.5f,21.2f,18.9f)<<"\n";
    cout<<Maximum(11.5,21.2,56.3)<<"\n";
    cout<<Maximum(11,21,51)<<"\n";
    return 0;
}
#include<iostream>
using namespace std;
#pragma pack(1)

class ArrayX
{
  private:
    int *Arr;
    int iSize;
  
  public:
    //Paramesterised constructor with default argument (combination of default+parameterised constructor)
    ArrayX(int X = 5)           
    {
      iSize = X;             
      Arr = new int[iSize];  
    }

    ~ArrayX()               
    {
      delete []Arr;         
    }
};

int main()
{ 
  ArrayX *aobj1 = new ArrayX();   //Parameterised constructor
  ArrayX *aobj2 = new ArrayX(15);  //Parameterised constructor

  //(Function call)
  
  delete aobj1;   //Destructor
  delete aobj2;
  return 0;
}
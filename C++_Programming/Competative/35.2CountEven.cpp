#include<iostream>
using namespace std;
#pragma pack(1)

struct node 
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;

class SinglyLL
{
    private:
        PNODE first;
        int iCount;
    public:
        SinglyLL();
        int Count();
        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo,int iPos);
        int CountEven();
};

SinglyLL :: SinglyLL()
{
    this->first = NULL;
    this->iCount = 0;
}

int SinglyLL :: Count()
{
    return this->iCount;
}

void SinglyLL :: InsertFirst(int iNo)
{
    PNODE newn = NULL;

    newn = new NODE;
    newn->data = iNo;
    newn->next = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else 
    {
        newn->next = this->first;
        this->first = newn;
    }
    this->iCount++;
}

void SinglyLL :: InsertLast(int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = new NODE;
    newn->data = iNo;
    newn->next = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else 
    {
        temp = this->first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
    }
    this->iCount++;
}

void SinglyLL :: InsertAtPos(int iNo, int iPos)
{
    PNODE newn = NULL;
    PNODE temp = NULL;
    int i = 0;

    newn = new NODE;
    newn->data = iNo;
    newn->next = NULL;

    if((iPos < 1) || (iPos > iCount+1))
    {
        cout<<"Invalid Position\n";
        return;
    }
    if(iPos == 1)
    {
        this->InsertFirst(iNo);
    }
    else if(iPos == iCount+1)
    {
        this->InsertLast(iNo);
    }
    else 
    {
        temp = this->first;
        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }
        newn->next = temp->next;
        temp->next = newn;
        this->iCount++;
    }
}

int SinglyLL :: CountEven()
{
    int iCountEven = 0;
    PNODE temp = NULL;

    temp = this->first;

    while(temp != NULL)
    {
        if(temp->data % 2 == 0)
        {
            iCountEven++;
        }
        temp = temp->next;
    }
    return iCountEven;
}

int main()
{
    SinglyLL sobj;
    int iRet = 0;

    sobj.InsertFirst(51);
    sobj.InsertFirst(20);
    sobj.InsertFirst(11);

    iRet = sobj.CountEven();
    printf("Count of Even elements is : %d\n",iRet);

    return 0;
}

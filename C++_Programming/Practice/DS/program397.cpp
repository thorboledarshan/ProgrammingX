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
typedef struct node** PPNODE; 

int main()
{
    PNODE newn = NULL;
    newn = new NODE;                 //newn = (PNODE)malloc(sizeof(NODE)); in C

    newn->data = 11;
    newn->next = NULL;

    cout<<newn->data<<endl;

    delete(newn);                    // free(newn); in C

    return 0;
}
class node 
{
    public int data;
    public node next;

    node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    private node first;
    private int iCount;           

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);     

        if(first == null)
        {
            first = newn;
        }
        else
        {
            node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }
        iCount++;        
    }

    public void InsertAtPos(int iNo, int iPos)
    {
        node temp = null;
        node newn = null;
        int i = 0;
        
        if((iPos < 1) || (iPos > iCount+1))
        {
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(iNo);
        }
        else
        {
            newn = new node(iNo);

            temp = first;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;

            iCount++;
        }
    }

    void DispalyEven()
    {
        node temp = null;
        temp = this.first;

        System.out.println("Even elements are : ");

        while(temp != null)
        {
            if(temp.data % 2 == 0)
            {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
}

class DisplayEven35_5
{
    public static void main(String A [])
    {
        
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(10);

        sobj.DispalyEven();
    }
}
class Marvellous
{
    public int i,j,k;
    public Marvellous(int a, int b, int c)
    {
        this.i = a;
        this.j = b;
        this.k = c;
    }

    public boolean equals(Object obj2)
    {
      Marvellous temp = (Marvellous) obj2;
      if((this.i == temp.i)&& (this.j == temp.j)&& (this.k == temp.k))
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}

class EqualsDemoX
{
    public static void main(String A[])
    {
        Marvellous mobj1 = new Marvellous(11,21,51);
        Marvellous mobj2 = new Marvellous(11,21,51);

        if(mobj1.equals(mobj2))
        {
            System.out.println("Objects are identical");
        }
        else 
        {
           System.out.println("Objects are different");
        }

    }
}
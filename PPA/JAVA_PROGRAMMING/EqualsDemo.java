class Marvellous
{
    public int i,j,k;
    public Marvellous(int a, int b, int c)
    {
        this.i = a;
        this.j = b;
        this.k = c;
    }
}

class EqualsDemo
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
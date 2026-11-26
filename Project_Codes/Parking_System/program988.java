class Demo
{
    public int i,j;

    public Demo fun()
    {
        return this; //returns caller object (ji ahe tich return pathavtey)
    }

    public int gun()
    {
        return 11;
    }

}

class program988
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        int ret = dobj.fun().gun();  // 

        System.out.println(ret);
    }
}
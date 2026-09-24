class Marvellous
{

}

class Hello
{

}

class HashCodeDemo
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        Hello hobj = new Hello();

        System.out.println(mobj.hashCode());
        System.out.println(hobj.hashCode());
    }
}
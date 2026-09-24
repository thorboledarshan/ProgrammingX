class Marvellous
{
   public Marvellous()
   {
    System.out.println("Inside constructor");
   }

   protected void finalize()
   {
    System.out.println("Inside finalize method");
   }
}


class FinalizeDemo
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        mobj = null;
        System.gc();
        System.out.println("End of main");
    }
}
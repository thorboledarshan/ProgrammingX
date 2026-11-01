import java.util.*;

class program837
{
    public static void main(String A[]) throws Exception
    {
        ArrayList <String> aobj = new ArrayList <String> (); //$ (generic)

        aobj.add("Pune");
        aobj.add("Mumbai");
        aobj.add("Satara");
        aobj.add("Nashik");
        aobj.add("Mumbai");

        if(aobj.contains("Satara"))
        {
            System.out.println("Satara is present in arraylist");
        }
        else 
        {
            System.out.println("Satara is not present in arraylist");
        }
    }
}
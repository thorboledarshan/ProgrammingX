import java.util.*;

class program835
{
    public static void main(String A[]) throws Exception
    {
        ArrayList <Integer> aobj = new ArrayList <Integer> ();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);
        aobj.add(51);

        aobj.remove(4); //$

        for(int no : aobj)   //no is new temporary variable  
        {
            System.out.println(no);
        }

        aobj.clear(); //$

        System.out.println(aobj);
    }
}
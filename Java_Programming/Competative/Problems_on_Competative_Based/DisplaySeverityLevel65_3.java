/* 
3. A hospital receives patients with severity levels:

Amit 5
Pooja 1
Rahul 2
Neha 4

Higher severity should be treated first.
Expected order:

Amit 5
Neha 4
Rahul 2
Pooja 1


*/

import java.util.*;

class Patient 
{
    public String name;
    public int severity;

    public Patient(String a, int b)
    {
        this.name = a;
        this.severity = b; 
    }

    @Override
    public String toString()
    {
        return this.name+" "+this.severity;
    }

}
class DisplaySeverityLevel65_3
{
    public static void main(String A[])
    {
        int i = 0;
        int j = 0;

        Patient Arr[] = {
                            new Patient("Rahul",2),
                            new Patient("Amit",5),
                            new Patient("Pooja",1),
                            new Patient("Neha",4)
                        };

        for(i = 0; i < Arr.length - 1; i++)
        {
            for(j = 0; j < Arr.length - 1 - i; j++)
            {
                if(Arr[j].severity < Arr[j+1].severity)
                {
                    Patient temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

        /*
        //Using Collection
                                                                   //Descending order key(p2-p1)
        PriorityQueue<Patient> pobj = new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity); 

        pobj.offer(new Patient("Rahul", 2));
        pobj.offer(new Patient("Amit", 5));
        pobj.offer(new Patient("Pooja", 1));
        pobj.offer(new Patient("Neha", 4));

        while(!pobj.isEmpty())
        {
            System.out.println(pobj.poll());
        }
        
        */
    }  
}

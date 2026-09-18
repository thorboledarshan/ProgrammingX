/* 
3. Group Employees Department-Wise
Employee records:

Amit IT
Rahul HR
Pooja IT
Neha Finance
Kiran HR
Riya IT

Expected output:
IT:
Amit
Pooja
Riya

HR:
Rahul
Kiran

Finance:
Neha

*/

import java.util.*;

class GroupEmployees66_3
{
    public static void main(String A[])
    {    
        LinkedHashMap<String, ArrayList<String>> hobj = new LinkedHashMap<String, ArrayList<String>>();

        if(hobj.containsKey("IT"))
        {
            hobj.get("IT").add("Amit");
        }
        else
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Amit");
            hobj.put("IT", list);
        }

        if(hobj.containsKey("HR"))
        {
            hobj.get("HR").add("Rahul");
        }
        else
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Rahul");
            hobj.put("HR", list);
        }
        
        if(hobj.containsKey("Finance"))
        {
            hobj.get("Finance").add("Neha");
        }
        else
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Neha");
            hobj.put("Finance", list);
        }


        hobj.get("IT").add("Pooja");
        hobj.get("IT").add("Riya"); 
        hobj.get("HR").add("Kiran");
        

        for(String key : hobj.keySet())
        {
            System.out.println(key + ":");

            for(String name : hobj.get(key))
            {
                System.out.println(name);
            }

            System.out.println();
        }

        
    }
}

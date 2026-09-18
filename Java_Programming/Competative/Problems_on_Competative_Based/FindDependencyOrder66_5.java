/* 
4. Software Dependency Resolver
A software project has dependencies:

Database - Backend
Backend - API
API - Frontend

Determine a valid order in which modules should be initialized.

Expected:

Database
Backend
API
Frontend


*/

import java.util.*;

class FinddependencyOrder66_5
{
    public static void main(String A[])
    {    
        HashMap<String, ArrayList<String>> hobj = new HashMap<String, ArrayList<String>>();

        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Backend");
        hobj.put("Database",listB);

        ArrayList<String> listA = new ArrayList<String>();
        listA.add("API");
        hobj.put("Backend",listA);

        ArrayList<String> listF = new ArrayList<String>();
        listF.add("Frontend");
        hobj.put("API",listF);

        

        HashMap<String,Integer> indegree = new HashMap<String,Integer> ();

        indegree.put("Database",0);
        indegree.put("Backend",0);
        indegree.put("API",0);
        indegree.put("Frontend",0);

        //Calculate indegree
        for(String key : hobj.keySet())
        {
            for(String value : hobj.get(key))
            {
                indegree.put(value,indegree.get(value) + 1);
            }
        }

        Queue <String> qobj = new ArrayDeque<String> ();

        // Put indegree-0 modules into a Queue.

        for(String key : indegree.keySet())
        {
            if(indegree.get(key) == 0)
            {
                qobj.offer(key);
            }
        }

        while(!qobj.isEmpty()) //Repeat until Queue is empty.
        {
            String current = qobj.poll(); //Remove one module from Queue

            System.out.println(current);

            //Decrease indegree of its dependent modules.
            if(hobj.containsKey(current))
            {
                for(String value : hobj.get(current))
                {
                    indegree.put(value, indegree.get(value) - 1);

                    if(indegree.get(value) == 0)  //If any becomes 0, add it to Queue.
                    {
                        qobj.offer(value);
                    }
                }
            }
        }
    }
}

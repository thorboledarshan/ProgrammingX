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

For a more complex input:

A-C
B-C
C- D
B-E
D- F
E-F

find a valid dependency order.
*/

import java.util.*;

class ShortestPath_Graphs_BFS
{
    public static void main(String A[])
    {    
        HashMap<String, ArrayList<String>> hobj = new HashMap<String, ArrayList<String>>();

        //Build the dependency graph.
        if(hobj.containsKey("C"))
        {
            hobj.get("C").add("A");
        }
        else 
        {
            ArrayList<String> list = new ArrayList<String>();

            list.add("A");
            hobj.put("C",list);
        }

        hobj.get("C").add("B");

        ArrayList<String> listD = new ArrayList<String>();
        listD.add("C");
        hobj.put("D",listD);

        ArrayList<String> listE = new ArrayList<String>();
        listE.add("B");
        hobj.put("E",listE);

        ArrayList<String> listF = new ArrayList<String>();
        listF.add("D");
        hobj.put("F",listF);

        hobj.get("F").add("E");

        HashMap<String, Integer> indegree = new HashMap<String, Integer>();
        indegree.put("A", 0);
        indegree.put("B", 0);
        indegree.put("C", 0);
        indegree.put("D", 0);
        indegree.put("E", 0);
        indegree.put("F", 0);

        //Calculate indegree of every element
        for(String key : hobj.keySet())
        {
            for(String value : hobj.get(key))
            {
                indegree.put(value, indegree.get(value) + 1);
            }
        }

        Queue<String> qobj = new ArrayDeque<String>();

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

/* 
5. Social Network Shortest Connection

A social networking application contains friendships:

Amit -> Rahul, Pooja
Rahul -> Neha
Pooja -> Kiran
Neha -> Riya
Kiran -> Riya

Find the minimum number of connections required to reach from:

Amit - Riya

One possible path:

Amit - Rahul - Neha - Riya

Number of connections: 3
*/

import java.util.*;

class FindShortestPath66_6
{
    public static void main(String A[])
    {    
        HashMap<String, ArrayList<String>> hobj = new HashMap<String, ArrayList<String>>();

        ArrayList<String> listA = new ArrayList<String>();
        listA.add("Rahul");
        hobj.put("Amit",listA);

        hobj.get("Amit").add("Pooja");

        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Neha");
        hobj.put("Rahul",listB);

        ArrayList<String> listC = new ArrayList<String>();
        listC.add("Kiran");
        hobj.put("Pooja",listC);

        ArrayList<String> listD = new ArrayList<String>();
        listD.add("Riya");
        hobj.put("Neha",listD);

        ArrayList<String> listE = new ArrayList<String>();
        listE.add("Riya");
        hobj.put("Kiran",listE);


        Queue<String> qobj = new ArrayDeque<String>();
        HashSet<String> visited = new HashSet<String> ();
        HashMap<String,Integer> distance = new HashMap<String,Integer> ();

        qobj.offer("Amit");
        visited.add("Amit");
        distance.put("Amit",0);

        //Continue till values in queue
        while(!qobj.isEmpty())
        {
            String current = qobj.poll();  //removes element and returns that element

            if(hobj.containsKey(current))
            {
                for(String friend : hobj.get(current))
                {
                    if(!visited.contains(friend)) //if not visited then only enter
                    {
                        visited.add(friend);  //Mark friends visited

                        distance.put(friend, distance.get(current) + 1); //update distances

                        qobj.offer(friend);  //add friend to queue


                    }
                }
            }
        }

        System.out.println("Number of connections : " + distance.get("Riya"));  //Prints output
    }
}

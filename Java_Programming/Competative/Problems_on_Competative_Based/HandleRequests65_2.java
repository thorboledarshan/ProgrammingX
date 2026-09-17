/* 
2. Customers submit support requests:

R101
R102
R103
R104

Requests must normally be handled in the same order in which they arrive.
Implement:

addRequest()
processRequest()
showPendingRequests()

*/

import java.util.*;

class HandleRequests65_2
{
    public static void main(String A[])
    {
        Queue<String> qobj = new ArrayDeque<>();

        //Add request
        qobj.offer("R101");
        qobj.offer("R102");
        qobj.offer("R103");
        qobj.offer("R104");

        //processRequest
        String request = qobj.poll();

        if(request != null)
        {
            System.out.println("Current request : "+request);
        }

        //show remaining requests
        System.out.println("Pending Requests:");
        for(String req : qobj)
        {
            System.out.println(req);
        }

    }  
}

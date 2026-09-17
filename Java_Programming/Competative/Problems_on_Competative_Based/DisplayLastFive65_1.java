/* 
1. A browser wants to store only the last 5 visited websites.

Visits:
google.com
github.com
openai.com
oracle.com
stackoverflow.com
youtube.com

After all visits, history should contain:

github.com
openai.com
oracle.com
stackoverflow.com
youtube.com

*/

import java.util.*;

class DisplayLastFive65_1
{
    public static void main(String A[])
    {
        /*
        int i = 0;

        String Visits[] = {"google.com","github.com","openai.com","oracle.com","stackoverflow.com","youtube.com"};

        int start = Math.max(0, Visits.length - 5); //last 5 we want  (Math.max returns max number)

        for( i = start; i < Visits.length; i++)
        {
            System.out.println(Visits[i]);
        }
        */

        Deque<String> history = new ArrayDeque<String> ();

        history.addLast("google.com");
        history.addLast("github.com");
        history.addLast("openai.com");
        history.addLast("oracle.com");
        history.addLast("stackoverflow.com");
        history.addLast("youtube.com");

        while(history.size() > 5)
        {
            history.removeFirst();
        }

        for(String site : history)
        {
            System.out.println(site);
        }
        
    }  
}

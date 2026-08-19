/* 
4. A traffic police app records whether a rider violated rules. Each violation has a fixed fine.
If multiple violations happen, fines should be added.

Fines:
No helmet₹500
No license₹1000
Overspeeding ₹1500

Input:
Helmet worn (Yes/No)
License available (Yes/No)
Overspeeding (Yes/No)

Validations:
Inputs must be Yes/No only

Expected Output:
Total Fine Amount: ₹<amount>

*/

import java.util.*;

class Solution
{
    private String Helmet;
    private String License;
    private String OverSpeeding;
    private int Fine;

    public Solution(String a, String b,String c)
    {
        this.Helmet = a;
        this.License = b;
        this.OverSpeeding = c;
    }

    public void CalculateFine()
    {
        if(
            !Helmet.equals("yes") && !Helmet.equals("no") ||
            !License.equals("yes") && !License.equals("no") ||
            !OverSpeeding.equals("yes") && !OverSpeeding.equals("no")
          )
          {
            System.out.println("Invalid input");
            return;
          }
          
          Fine = 0;

          if(Helmet.equals("no"))
          {
            Fine = Fine + 500;
          }

          if(License.equals("no"))
          {
            Fine = Fine + 1000;
          }

          if(OverSpeeding.equals("yes"))
          {
            Fine = Fine + 1500;
          }

          System.out.println("Total Fine Amount : "+Fine);
    }

}

class TrafficFine49_4
{
    public static void main(String A[])
    {
        String Helmet = null;
        String License = null;
        String OverSpeeding  = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Helmet worn (yes/no) : ");
        Helmet = sobj.nextLine();

        System.out.println("Licence (yes/no) : ");
        License = sobj.nextLine();

        System.out.println("OverSpeeding (yes/no) : ");
        OverSpeeding = sobj.nextLine();

        Solution obj = new Solution(Helmet,License,OverSpeeding);

        obj.CalculateFine();

    }
}

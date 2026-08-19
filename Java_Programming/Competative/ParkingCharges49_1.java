/* 
1. A shopping mall parking gate records entry and exit duration in hours.
The parking system calculates charges based on the total hours a vehicle stayed. Long-duration parking attracts
additional penalty.

Rules:
First 2 hours ₹20 (flat)
After 2 hours - ₹10 per extra hour
If total hours >10-> add ₹50 penalty

Input:Total parking hours (integer)

Validations: Hours cannot be negative

Expected Output:
Total Parking Duration: <hours> hours
Total Parking Fee: ₹<amount>
*/

import java.util.*;

class Solution
{
    private int Duration;
    private int Fee;

    public Solution(int a)
    {
        this.Duration = a;
    }

    public void calculatecharges()
    {
        if(Duration < 0)
        {
            System.out.println("Invalid input");
            return;
        }
        else if(Duration <= 2)
        {
            Fee = 20;
            System.out.println("Total parking duration : "+Duration+" hours");
            System.out.println("Total parking fee : "+Fee);
        }
        else if(Duration <= 10)
        {
            Fee = 20 + ((Duration - 2)*10);
            System.out.println("Total parking duration : "+Duration+" hours");
            System.out.println("Total parking fee : "+Fee);
        }
        else if(Duration > 10)
        {
            Fee = 20 + ((Duration - 2)*10) + 50;
            System.out.println("Total parking duration : "+Duration+" hours");
            System.out.println("Total parking fee : "+Fee);
        }

    }

}

class ParkingCharges49_1
{
    public static void main(String A[])
    {
        int Duration = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter total parking hours : ");
        Duration = sobj.nextInt();

        Solution obj = new Solution(Duration);
        obj.calculatecharges();

    }
}

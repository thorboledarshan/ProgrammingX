/* 
2. A scholarship committee uses a strict checklist. Only students who meet all academic and financial conditions qualify.

Conditions:
Marks ≥ 80%
Attendance ≥ 75%
Family income ≤ ₹3,00,000

Input:
Marks percent (integer)
Attendance percent (integer)
Family income (integer)

Validations:
Marks and attendance must be 0-100
Income cannot be negative

Expected Output:
Scholarship Approved
OR
Scholarship Rejected: <Reason>
*/

import java.util.*;

class Solution
{
    private int Marks;
    private int Attendance;
    private int Income;

    public Solution(int a, int b, int c)
    {
        this.Marks = a;
        this.Attendance = b;
        this.Income = c;
    }

    public void CheckQualification()
    {
        if(Income < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if( Marks < 0 || Marks > 100 ||
            Attendance < 0 || Attendance > 100
          )
        {
            System.out.println("Invalid input");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Marks below 80%");
            return;
        }

        if(Attendance < 75)
        {
            System.out.println("Attendance below 75%");
            return;
        }

        if(Income < 300000)
        {
            System.out.println("Income below 3 lakh");
            return;
        }

        System.out.println("Scholarship Approved");
        
    }

}

class CheckQualification50_2 
{
    public static void main(String A[])
    {
        int Marks = 0;
        int Attendance = 0;
        int Income = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Marks in percentage : ");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendance in percentage : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter Family Income : ");
        Income = sobj.nextInt();

        Solution obj = new Solution(Marks,Attendance,Income);

        obj.CheckQualification();

    }
}

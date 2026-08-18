/* 
1. In your college library, students borrow books for exams and assignments.
The librarian wants an automatic fine calculator so that staff don't need to calculate fines manually for every
student.
As per policy, a student can keep a borrowed book for up to 7 days without any penalty.
If the book is returned late, the fine depends on how many days the student kept the book in total.

Fine Rules:
If the book is returned within 7 days -> No fine
If total days are 8 to 12- ₹5 per day for each day beyond 7
. If total days are more than 12-+
₹5 per day for days 8-12
o ₹10 per day for each day beyond 12
*/

import java.util.*;

class Solution
{
    private int DaysKept;
    private int Fine;
    private int FineableDays;

    public Solution(int a)
    {
        this.DaysKept = a;
    }

    public void FineCalculator()
    {
        if(DaysKept < 0)
        {
            System.out.println("Invalid");
        }
        else if(DaysKept <= 7)
        {
            System.out.println("returned on time, no fine applicable");
        }
        else if(DaysKept <=12)
        {
            this.FineableDays = (DaysKept - 7);
            Fine = FineableDays * 5;
            System.out.println("Total fine to be paid : "+Fine);
        }
        else if(DaysKept > 12)
        {
            this.FineableDays = (DaysKept - 12);
            Fine = 25 + (FineableDays * 10);
            System.out.println("Total fine to be paid : "+Fine);
        }

    }

}

class FineCalculator48_1
{
    public static void main(String A[])
    {
        int DaysKept = 0;

        Scanner sobj = new Scanner(System.in);

        Solution obj = new Solution(DaysKept);

        System.out.println("Enter total no.of days book kept : ");
        DaysKept = sobj.nextInt();

        obj.FineCalculator();

    }
}

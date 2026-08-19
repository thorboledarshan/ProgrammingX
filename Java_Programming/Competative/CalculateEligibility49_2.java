/* 
2. A bank wants to quickly decide whether a customer is eligible for a personal loan.
The system checks the applicant's details and either approves the loan or rejects with the exact reason.

Eligibility Conditions:
Age 21 to 60 inclusive
Monthly income≥ ₹25,000
Credit score ≥ 700
Must NOT have an existing unpaid loan

Input:
Age
Monthly income
Credit score
Existing unpaid loan (Yes/No)

Validations:
Age/income/score must be non-negative
Yes/No must be valid

Expected Output:
Loan Approved
OR
Loan Rejected: <Specific Reason>
*/

import java.util.*;

class Solution
{
    private int Age;
    private int Income;
    private int CreditScore;
    private int LoanStatus;

    public Solution(int a, int b, int c, int d)
    {
        this.Age = a;
        this.Income = b;
        this.CreditScore = c;
        this.LoanStatus = d;
    }

    public void CalculateEligibility()
    {
        if(Age < 0 || Income < 0 || CreditScore < 0 )
        {
            System.out.println("Invalid input ");
            return;
        }

        if(LoanStatus != 0 && LoanStatus != 1)
        {
            System.out.println("Invalid input");
            return;
        }

        if(
            Age >=21 && Age <= 60 
            && Income >= 25000
            && CreditScore >= 700
            && LoanStatus == 0
          )
        {
            System.out.println("Loan Approved");
        }
       
        else 
        {
            if(Age < 21 || Age > 60)
            {
                System.out.println("Loan Rejected : Age does not fits in eligibility criteria");
            }
            else if(Income < 25000)
            {
               System.out.println("Loan Rejected : Income does not fits in eligibility criteria"); 
            }
            else if(CreditScore < 700)
            {
                System.out.println("Loan Rejected : Credit Score does not fits in eligibility criteria");
            }
            else if(LoanStatus != 0)
            {
                System.out.println("Loan Rejected : unpaid previous loan");
            }
        }

    }

}

class CalculateEligibility49_2
{
    public static void main(String A[])
    {
        int Age = 0;
        int Income = 0;
        int CreditScore = 0;
        int LoanStatus = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter monthly income : ");
        Income = sobj.nextInt();

        System.out.println("Enter Credit Score : ");
        CreditScore = sobj.nextInt();

        System.out.println("Enter Loan status paid or unpaid : ");
        System.out.println("Status : paid(press zero) -> unpaid(press 1)");
        LoanStatus = sobj.nextInt();

        Solution obj = new Solution(Age,Income,CreditScore,LoanStatus);

        obj.CalculateEligibility();

    }
}

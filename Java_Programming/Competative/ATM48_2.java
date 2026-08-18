/* 
 A bank ATM must follow strict safety rules to avoid fraud and ensure customers maintain a minimum balance.
A customer inserts the card, checks their balance, and requests a withdrawal.
The ATM must either approve the request and update the balance or reject it and show the correct reason.

Rules:
Withdrawal amount must be a multiple of ₹100
Maximum withdrawal per transaction is ₹25,000
. After withdrawal, balance must remain at least ₹1,000

Validations:
If balance < 0 or withdrawAmount <= 0+ invalid input

Input:
Line 1: current balance (integer)
Line 2: requested withdrawal amount (integer)
*/

import java.util.*;

class Solution
{
    private int CurrentBalance;
    private int WithdrawalAmount;
    private int newBalance;

    public Solution(int a, int b)
    {
        this.CurrentBalance = a;
        this.WithdrawalAmount = b;
    }

    public void WithdrawalCalculator()
    {
        if(CurrentBalance < 0 || WithdrawalAmount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(WithdrawalAmount % 100 != 0)
        {
            System.out.println("Withdrawal amount must be a multiple of 100");
        }
        else if(WithdrawalAmount > 25000)
        {
            System.out.println("Maximum withdrawal per transaction is Rs.25000");
        }
        else 
        {
            newBalance = CurrentBalance - WithdrawalAmount;

            if(newBalance < 1000)
            {
                System.out.println("Transaction Failed : ");
                System.out.println("Reason : Your new balance after withdrawal should be greater than 1000");
            }
            else 
            {
                System.out.println("Transaction Successfull.");   
                System.out.println("Remaining Balance is : Rs."+newBalance);
            }
        }


    }

}

class ATM48_2
{
    public static void main(String A[])
    {
        int CurrentBalance = 0;
        int WithdrawalAmount = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter current balance : ");
        CurrentBalance = sobj.nextInt();

        System.out.println("Enter amount to withdrawal : ");
        WithdrawalAmount = sobj.nextInt();

        Solution obj = new Solution(CurrentBalance,WithdrawalAmount);

        obj.WithdrawalCalculator();

    }
}

/*
2. An online election system stores votes by voter ID. Every voter can vote only once. If the same ID appears again, the vote must be rejected and counted as duplicate.

Input: Number of votes N
N voter IDs

Validations:
N≥0
IDs must be non-negative integers

Expected Output:
Valid Votes: <count>
Rejected Duplicate Votes: <count>

.
*/

import java.util.*;

class Solution
{
    private int N;

    private int IDs[];
    private int ValidCount;
    private int DuplicateCount;

    public Solution(int a)
    {
        this.N = a;
    }

    public void CalVotes()
    {
        Scanner sobj = new Scanner(System.in);

        if(N < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        IDs = new int [N];

        System.out.println("Enter Voters IDs last two digits (eg.12/34/56) : ");

        for(int i = 0; i < N; i++)
        {
            IDs[i] = sobj.nextInt();

            if(IDs[i] < 0)
            {
                System.out.println("Invalid input");
                return;
            }

            boolean Duplicate = false;

            for(int j = 0; j < i; j++)
            {
                if(IDs[i] == IDs[j])
                {
                    Duplicate = true;
                    break;
                }
            }

            if(Duplicate == true)
            {
                DuplicateCount++;
            }
            else 
            {
                ValidCount++;
            }
        }

        System.out.println("\nValid Votes : " +ValidCount);
        System.out.println("Rejected Duplicate Votes : " +DuplicateCount);

    }
}

class CalVotes52_2
{
    public static void main(String A[])
    {
        int N = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of votes : ");
        N = sobj.nextInt();

        Solution obj = new Solution(N);

        obj.CalVotes();
    }
}
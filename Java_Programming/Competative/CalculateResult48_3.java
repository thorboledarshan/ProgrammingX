/* 
3. A university wants to generate student results automatically.
Each student has marks in five subjects, each out of 100.
The result should clearly show whether the student failed in any subject and, if passed, the final classification based
on average marks.

Rules:
If marks in any subject < 35 -> student is Fail

If student passes all subjects, calculate average and classify:
Average ≥ 75 -> Distinction
Average ≥ 60-> First Class
Average ≥ 50-> Second Class
Average < 50 -> Pass

Input:
Five integers (marks in 5 subjects)
Validations:
Each mark must be between 0 and 100
*/

import java.util.*;

class Solution
{
    private int Marks[];


    public void CalculateResult()
    {   
        Scanner sobj = new Scanner(System.in);

        Marks = new int[5];

        System.out.println("Enter marks of 5 subjects : ");

        for(int i = 0; i < Marks.length; i++)
        {
            Marks[i] = sobj.nextInt();
        }

        int iSum = 0;
        int Average = 0;

        for(int i = 0; i < 5; i++)
        {
            if(Marks[i] < 0 || Marks[i] > 100)
            {
                System.out.println("Invalid Input");
                return;
            }

            if(Marks[i] < 35)
            {
                System.out.println("Result : Fail");
                return;
            }

            iSum = iSum + Marks[i];
        }

        Average = (iSum / 5);

        System.out.println("Average Marks : "+Average);

        if(Average >= 75)
        {
            System.out.println("Final Result : Distinction");
        }
        else if(Average >= 60)
        {
            System.out.println("Final Result : First Class");
        }
        else if(Average >= 50)
        {
            System.out.println("Final Result : Second Class");
        }
        else
        {
            System.out.println("Final Result : Pass");
        }

    }

}

class CalculateResult48_3
{
    public static void main(String A[])
    {
        Solution obj = new Solution();

        obj.CalculateResult();

    }
}

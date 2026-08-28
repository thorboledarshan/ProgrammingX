/*
3. A fitness app records steps for 7 days. It wants to show how many days user achieved the goal and what the
highest step count was.

Input: 7 integers (steps)

Validations:
Steps must be ≥0

Expected Output:
Goal Achieved Days: <count>
Maximum Steps in Week: <value>
*/

import java.util.*;

class Solution
{
    private int Steps[];
    private int MaxSteps;
    private int GoalSteps;
    private int GoalAchievedCount;

    public void CalFitnessGoal()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Daily Steps : ");

        MaxSteps = 0;
        Steps = new int [7];
        GoalAchievedCount = 0;
        GoalSteps = 2000;

        for(int i = 0; i < 7; i++)
        {
            Steps[i] = sobj.nextInt();

            if(Steps[i] < 0)
            {
                System.out.println("Invalid input");
                return;
            }

            if(Steps[i] > MaxSteps)
            {
                MaxSteps = Steps[i];
            }

            if(Steps[i] >= GoalSteps)
            {
                GoalAchievedCount++;
            }
        }

        System.out.println("Goal Achieved days : "+GoalAchievedCount);
        System.out.println("Maximum steps in week : "+MaxSteps);
    }
}

class CalFitnessGoal52_3
{
    public static void main(String A[])
    {
        Solution obj = new Solution();

        obj.CalFitnessGoal();
    }
}
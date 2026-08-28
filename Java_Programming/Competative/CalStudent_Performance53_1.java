/*
1. Design a Java application that analyzes stadent performance using a 2D matrix. A college stores marks of students in multiple subjects using a matrix:
. Rows represent students.
. Columns represent subjects.

Your program must analyze academic performance based on this matrix.

Requirements:
Your program should:
1. Calculate total marks of each student.
2. Identify the topper (student with highest total).
3. Calculate averae marks for each subject.
4. Print studemts who failed in any subject (marks < 35).

Input Format:
First line: Integer N (number of students)
Second line: Integer M (number of subjects)
Next N lines: M integers each (marks of each student)

Validations:
N>0
M>0
Each mark must be between 0 and 100
If invalid iput is found, print: Invalid Input.

Output Format:

Student Totals:
Student 1: <total>
Student 2: <total>

Topper: Student <index>

Subject Averages:
Subject 1: <avg>
Subject 2: <avg>

Students Failed:
<Student numbers>

Sample Input:

3
3
80 70 60
90 85 88
30 40 50

Sample Output:

Student Totals:
Student 1: 210
Student 2: 263
Student 3: 120

Topper: Student 2

Subject Averages:
Subject 1: 66.67
Subject 2: 65.00
Subject 3: 66.00

Student Failed:
Student 3
*/

import java.util.*;

class Solution
{
    private int iRow;
    private int iCol;

    private int Topper;
    private int Marks[][];
    private int index;

    public Solution(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;
        this.Topper = 0;
        this.index = 0;
    }

    public void CalPerformance()
    {
        int i = 0;
        int j = 0;
        int iMarkSum = 0;
        float iSubjectSum = 0.0f;

        //filter
        if(iRow <= 0 || iCol <= 0)
        {
            System.out.println("Invalid input : (iRow,iCol cannot be negative)");
            return;
        }

        Scanner sobj = new Scanner(System.in);

        Marks = new int[iRow][iCol];

        System.out.println("Enter Marks of student : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Marks[i][j] = sobj.nextInt();

                //filter
                if(Marks[i][j] < 0 || Marks[i][j] > 100)
                {
                    System.out.println("Invalid input : (Marks should be between 0 and 100)");
                    return;
                }
            }
            System.out.println();
        }

        System.out.println("Student Totals : ");

        for(i = 0; i < iRow; i++)
        {
            iMarkSum = 0;

            //Calculates Total marks of each student
            for(j = 0; j < iCol; j++)
            {
               iMarkSum = iMarkSum + Marks[i][j];
            }
            System.out.println("Student "+(i+1)+" : "+iMarkSum);
            

            //finds highest marks(Topper)
            if(iMarkSum > Topper)
            {
                Topper = iMarkSum;
                index = (i+1);
            }   
        }

        System.out.println();

        System.out.println("Topper : Student "+index);

        System.out.println();

        System.out.println("Subject Averages : ");

        //Calculate Average of each subject
        for(j = 0; j < iCol; j++)
        {
            iSubjectSum = 0;

            for(i = 0; i < iRow; i++)
            {
                iSubjectSum += Marks[i][j];
            }

            System.out.printf("Subject %d : %.2f%n", (j + 1), ((double) iSubjectSum / Marks.length));
        }
        System.out.println();

        //prints failed student
        System.out.println("Students Failed : ");

        for(i = 0; i < iRow; i++)
        {
            boolean Failed = false;

            for(j = 0; j < iCol; j++)
            {
                if(Marks[i][j] < 35)
                {
                    Failed = true;
                    break;
                }
            }

            if(Failed)
            {
                System.out.println("Student " + (i + 1));
            }
        }
        
    }
}

class CalStudent_Performance53_1
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of students : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of Subjects : ");
        iCol = sobj.nextInt();

        Solution obj = new Solution(iRow,iCol);

        obj.CalPerformance();

    }
}
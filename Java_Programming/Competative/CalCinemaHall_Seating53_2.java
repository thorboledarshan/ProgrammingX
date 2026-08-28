/*
2. Design a Java application to manage cinema hall seating using a 2D array.
The cinema hall has:
. Rows representing seat rows
. Columns representing seats in each row

Each seat is represented as:
. 0-Empty

. 1-Booked

Requirements:
Your program must:

1. Count total booked seats.
2. Find row with maximum bookings.
3. Check if any row is completely full.
4. Display seat matrix.

Input Format:
. First line: Integer R (rows)
. Second line: Integer C (columns)
. Next R lines: C integers (0 or 1)

Validations:
. R>0
. C>0
. Matrix values must be 0 or 1 only

Output Format:
Total Booked Seats: <count>
Row With Maximum Bookings: Row <number>
Full Row Exists: Yes/No

Sample Input:
3
4
1011
1111
0010

Sample Output:
Total Booked Seats: 8
Row With Maximum Bookings: Row 2
Full Row Exists: Yes

*/

import java.util.*;

class Solution
{
    private int iRow;
    private int iCol;

    private int Seats[][];
    private int iCount[];
    private int MaxBooking[];
    private int iMax;
    private int iCnt;
    private boolean RowFull;
    private int index;

    public Solution(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        RowFull = false;
        iMax = 0;
        iCnt = 0;
        index = 0;
    }

    public void CalSeatBooking()
    { 
        Scanner sobj = new Scanner(System.in);

        if(iRow <= 0 || iCol <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        Seats = new int[iRow][iCol];
        iCount = new int[iRow];
        MaxBooking = new int[iRow];
    
        System.out.println("Enter seat is booked or not ( press 0 ->Empty, 1 ->Booked)");

        for(int i = 0; i < iRow; i++)
        {

            for(int j = 0; j < iCol ; j++)
            {
                Seats[i][j] = sobj.nextInt();

                //Filter
                if(Seats[i][j] != 0 && Seats[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }

                //total(iCnt) seats booked count
                if(Seats[i][j] == 1)
                {
                    iCnt++;
                    iCount[i] = iCount[i] + 1;
                }

            }

            System.out.println();

            MaxBooking[i] = iCount[i];

            //Checks row is full or not
            if(iCount[i] == iCol)
            {
                RowFull = true;
            }
        }

        //Calculate max booked row number
        for(int i = 0; i < iRow; i++)
        {
            if(MaxBooking[i] > iMax)
            {
                iMax = iMax + MaxBooking[i];
                index = (i + 1);
            }
        }

        System.out.println("Total booked seats : "+iCnt);

        System.out.println("Row with maximum booking : Row "+index);

        if(RowFull == true)
        {
            System.out.println("Full Row Exists : Yes");
        }
        else 
        {
            System.out.println("Full Row Exists : No");
        }

        System.out.println("Display seat matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Seats[i][j] + " ");
            }

            System.out.println();
        }
    }
}

class CalCinemaHall_Seating53_2
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of seating rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of seats in each row : ");
        iCol = sobj.nextInt();

        Solution obj = new Solution(iRow,iCol);

        obj.CalSeatBooking();

    }
}
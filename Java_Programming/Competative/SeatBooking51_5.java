/*
5. Cinema Seat Booking with Row Pricing + Group Discount
Seats have different prices per row. User tries booking multiple seats; reject if already booked.
If group size ≥ 6 give 10% discount.

Input: rows, cols, bookedSeatList, requestedSeatList

Output: success/fail + total cost + remaining seats
*/

import java.util.*;

class Solution
{
    private int Row;
    private int Col;

    private int Seats[][];
    private int RowPrice[];

    private int BookedSeat;
    private int RequestedSeats;

    public Solution(int a, int b)
    {
        this.Row = a;
        this.Col = b;
    }

    public void CalSeatBooking()
    {
        Scanner sobj = new Scanner(System.in);

        Seats = new int [Row][Col]; //memory allocation

        System.out.println("Enter booked seats count : ");
        BookedSeat = sobj.nextInt();

        //Sets booked seats to 1
        for(int i = 0; i < BookedSeat; i++)
        {
            System.out.println("Enter booked seats(eg.A1/B2/C3) : ");

            String seat = sobj.next();

            int row = seat.charAt(0) - 'A';

            int col = Integer.parseInt(seat.substring(1)) - 1;

            Seats[row][col] = 1;
        }

        RowPrice = new int[Row];

        //Enter Price of each Row
        for(int i = 0; i < Row ; i++)
        {
            System.out.print("Enter price for row " + (char)('A' + i) + " : ");
            RowPrice[i] = sobj.nextInt();
        }
        
        System.out.println("Enter requested seats count : ");
        RequestedSeats = sobj.nextInt();

        String RequestedSeatList[] = new String[RequestedSeats];

        //check requested set  availability
        for(int i = 0; i < RequestedSeats; i++)
        {
            System.out.println("Enter requested seat(eg.A1/B2/C3) : ");

            RequestedSeatList[i] = sobj.next();

            int rowx = RequestedSeatList[i].charAt(0) - 'A';

            int colx = Integer.parseInt(RequestedSeatList[i].substring(1)) - 1;

            if(Seats[rowx][colx] == 1)
            {
                System.out.println("Booking failed : Seat already booked");
            }
        }

        System.out.println("Booking completed successfully");

        int TotalCost = 0;

        //Calculate Total Price of tickets
        for(int i = 0; i < RequestedSeats; i++)
        {
            int row = RequestedSeatList[i].charAt(0) - 'A';

            TotalCost = TotalCost + RowPrice[row];
        }


        //for discount
        if(RequestedSeats >= 6)
        {
            int Discount = (TotalCost * 10) / 100;

            TotalCost = TotalCost - Discount;

            System.out.println("Discount : Rs." + Discount);
        }
        else 
        {
            System.out.println("Discount : Rs.0");
        }

        //Mark requested seats as booked now. 
        for(int i = 0; i < RequestedSeats; i++)
        {
            int row = RequestedSeatList[i].charAt(0) - 'A';

            int col = Integer.parseInt(RequestedSeatList[i].substring(1)) - 1;

            Seats[row][col] = 1;
        }

        System.out.println("Total Cost : " + TotalCost);

        //Display remaining seats
        int iCount = 0;
        for(int i = 0; i < Row; i++)
        {
            for(int j = 0; j < Col; j++)
            {
                if(Seats[i][j] == 0)
                {
                    System.out.print("O\t");
                    iCount++;
                }
                else
                {
                    System.out.print("1\t");
                }
            }
            System.out.println();
        }

        System.out.println("Remaining seats are : "+iCount);   
    }
}

class SeatBooking51_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int rows = 0;
        int columns = 0;

        System.out.print("Enter number of rows : ");
        rows = sobj.nextInt();

        System.out.print("Enter number of columns : ");
        columns = sobj.nextInt();

        Solution obj = new Solution(rows,columns);

        obj.CalSeatBooking();

        sobj.close();
    }
}
///////////////////////////
// Generic Matrix Program
///////////////////////////

import java.util.*;

class Matrix<T extends Number> //$
{
    protected Object Arr[][]; //$
    protected int iRow;
    protected int iCol;

    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside Matrix constructor");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new Object[iRow][iCol]; //$
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextDouble();
            }
        }
    }

    public void Display()
    {
        System.out.println("Entered elements of matrix are : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }

            System.out.println();
        }
    }
}

class MatrixLB<T extends Number> extends Matrix<T> //$
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

    public double SummationAll()
    {
        double dSum = 0.0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                dSum = dSum + ((Number)Arr[i][j]).doubleValue(); //$
            }
        }

        return dSum;
    }

    public void SummationRow()
    {
        double dSum = 0.0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                dSum = dSum + ((Number)Arr[i][j]).doubleValue(); //$
            }

            System.out.println("Summation of row " + i + " is : " + dSum);

            dSum = 0.0;
        }
    }

    public double MaximumAll()
    {
        double dMax = ((Number)Arr[0][0]).doubleValue(); //$

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                double dValue = ((Number)Arr[i][j]).doubleValue(); //$

                if(dValue > dMax)
                {
                    dMax = dValue;
                }
            }
        }

        return dMax;
    }

    public double MinimumAll()
    {
        double dMin = ((Number)Arr[0][0]).doubleValue(); //$

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                double dValue = ((Number)Arr[i][j]).doubleValue(); //$

                if(dValue < dMin)
                {
                    dMin = dValue;
                }
            }
        }

        return dMin;
    }
}

class program801
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0;
        int iCol = 0;

        double dRet = 0.0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        MatrixLB<Double> mobj = new MatrixLB<Double>(iRow, iCol); //IMP $

        mobj.Accept();

        mobj.Display();

        dRet = mobj.SummationAll();

        System.out.println("Summation of all elements is : " + dRet);

        mobj.SummationRow();

        dRet = mobj.MaximumAll();

        System.out.println("Maximum number is : " + dRet);

        dRet = mobj.MinimumAll();

        System.out.println("Minimum number is : " + dRet);

        mobj = null;

        System.gc();
    }
}
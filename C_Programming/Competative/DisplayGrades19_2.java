///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Display grades on marks.
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void DisplayGrades(int iMarks)
    {
        if(iMarks >= 75 && iMarks <=100)
        {
            System.out.println("Grade : Distinction ");
        }
        else if(iMarks >= 60 )
        {
            System.out.println("Grade : First Class ");
        }
        else if(iMarks >= 50)
        {
            System.out.println("Grade : Second Class");
        }
        else if(iMarks >= 35)
        {
            System.out.println("Grade : Pass");
        }
        else if(iMarks < 35)
        {
            System.out.println("Grade : Fail");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}


class DisplayGrades19_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrades(87);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 70
// ouput : First Class
//
///////////////////////////////////////////////////////////////////////////////////////////////
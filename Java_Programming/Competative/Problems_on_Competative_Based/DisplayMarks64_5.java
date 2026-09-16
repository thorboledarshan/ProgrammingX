/* 
5. Student data is:

Amit 78
Pooja 92
Rahul 85
Neha 92
Kiran 67

Create a Student class and display students according to descending marks.

If two students have equal marks, sort them alphabetically.

Expected output:

Neha 92
Pooja 92
Rahul 85
Amit 78
Kiran 67

*/

import java.util.*;

class Student 
{
    public String name;
    public int marks;

    public Student(String a, int b)
    {
        this.name = a;
        this.marks = b; 
    }

    @Override
    public String toString()
    {
        return this.name+" "+this.marks;
    }

}
class DisplayMarks64_5
{
    public static void main(String A[])
    {
        int i = 0;
        int j = 0;

        Student Arr[] = {
                            new Student("Amit",78),
                            new Student("Pooja",92),
                            new Student("Rahul",85),
                            new Student("Neha",92),
                            new Student("Kiran",67)
                        };

        for(i = 0; i < Arr.length - 1; i++)
        {
            for(j = 0; j < Arr.length - 1 - i; j++)
            {
                if(Arr[j].marks < Arr[j+1].marks)
                {
                    Student Temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = Temp;
                }
                else if(Arr[j].marks == Arr[j+1].marks) 
                {
                    
                    if(Arr[j].name.compareTo(Arr[j+1].name) > 0)  //0,-1,1(B->A)
                    {
                        Student Temp = Arr[j];
                        Arr[j] = Arr[j+1];
                        Arr[j+1] = Temp;
                    }
                    
                }
            }
        }

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }  
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
/*  Accept division of student from user and depends on the division
    display exam timing. There are 4 divisions in school as A,B,C,D. Exam
    of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM.
    (Application should be case insensitive)
*/
//
///////////////////////////////////////////////////////////////////////////////////////////////


#include<stdio.h>


void DisplaySchedule(char cCh)
{
  if(cCh =='A' || cCh =='a')
  {
    printf("Exam of division %c is at 7 AM \n",cCh);
  }
  else if(cCh == 'B' || cCh =='b')
  {
    printf("Exam of division %c is at 8:30 AM \n",cCh);
  }
  else if(cCh == 'C' || cCh =='c')
  {
    printf("Exam of division %c is at 9:20 AM \n",cCh);
  }
  else if(cCh == 'D' || cCh =='d')
  {
    printf("Exam of division %c is at 10:30 AM \n",cCh);
  }
  else 
  {
    printf("Invalid Division \n");
    printf("Enter Division (eg.A,B,C,D) \n");
  }


}

int main()
{
    char cValue = '\0';

    printf("Enter Character : ");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);
    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter Character : A
// output : Exam of division C is at 9:20 AM
//
///////////////////////////////////////////////////////////////////////////////////////////////
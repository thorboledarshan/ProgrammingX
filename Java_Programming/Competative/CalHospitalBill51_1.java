/* 
1. A hospital bill includes consultation + medicine + room charges per day. If insured, insurance covers up to
₹50,000 or 70% of bill (whichever is lower). ICU ward costs extra.

Input: days, wardType(Normal/ICU), medicineBill, consultationFee, insured(Yes/No)

Output: totalBill, insuranceCover, finalPay
*/

import java.util.*;

class Solution
{
    private int Days;
    private int MedicineBill;
    private int ConsultationFee;
    private int RoomCharge; 
    private String Insurance;
    private String WardType;
    private int TotalBill;
    private int ICUWardCost;
    private int FinalBill;

    public Solution(int a, int b, int c,int d, String e, String f)
    {
        this.Days = a;
        this.MedicineBill = b;
        this.ConsultationFee = c;
        this.RoomCharge = d;
        this.Insurance = e;
        this.WardType = f;
    }

    public void CalculateBill()
    {
        if(Days < 0 || MedicineBill < 0 || ConsultationFee < 0 || RoomCharge < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(
            !WardType.equalsIgnoreCase("ICU") && !WardType.equalsIgnoreCase("normal") ||
            !Insurance.equalsIgnoreCase("yes") && !Insurance.equalsIgnoreCase("no") 
           
          )
        {
            System.out.println("Invalid input");
            return;
        }

        TotalBill = Days * (MedicineBill + ConsultationFee + RoomCharge);

        if(WardType.equalsIgnoreCase("ICU"))
        {
            ICUWardCost = Days * 100;
            TotalBill = TotalBill + ICUWardCost;
        }

        int ApprovedInsurance = 0;

        if(Insurance.equalsIgnoreCase("yes"))
        {
            int InsuranceCover1 = 50000;
            int InsuranceCover2 = (TotalBill * 70) / 100;

            if(InsuranceCover1 <= InsuranceCover2)
            {
                ApprovedInsurance = InsuranceCover1;
            }
            else
            {
                ApprovedInsurance = InsuranceCover2;
            }

            FinalBill = TotalBill - ApprovedInsurance;
        }
        else
        {
            FinalBill = TotalBill;
        }

        System.out.println("Total Bill : "+TotalBill);
        System.out.println("Insurance cover : "+ApprovedInsurance);
        System.out.println("Final Bill : "+FinalBill);

    }

}

class CalHospitalBill51_1 
{
    public static void main(String A[])
    {
        int Days = 0;
        int MedicineBill = 0;
        int ConsultationFee = 0;
        int RoomCharge = 0;
        String Insurance = null;
        String WardType = null;


        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of days in hospital : ");
        Days = sobj.nextInt();

        System.out.println("Enter medicinebill : ");
        MedicineBill = sobj.nextInt();

        System.out.println("Enter consultation fee : ");
        ConsultationFee = sobj.nextInt();

        System.out.println("Enter room charge per day : ");
        RoomCharge = sobj.nextInt();

        System.out.println("Enter Insurance (yes/no) : ");
        Insurance = sobj.next();

        System.out.println("Enter ward type (normal/icu) : ");
        WardType = sobj.next();

        Solution obj = new Solution(Days,MedicineBill,ConsultationFee,RoomCharge,Insurance,WardType);

        obj.CalculateBill();

    }
}

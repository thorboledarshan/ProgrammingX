//Factory Design Pattern

enum VehicleType
{
    BIKE, //Macros
    CAR,
    TRUCK
}

class program975
{
    public static  void main(String A[])
    {
       VehicleType obj = VehicleType.CAR;

       System.out.println(obj);
       System.out.println(VehicleType.CAR);
    }
}
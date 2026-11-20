///////////////////////////////
// 
//  SINGLETON DESIGN PATTERN
//
///////////////////////////////

class ParkingLot
{
    private static ParkingLot instance; //self referrential class

    private ParkingLot() //constructor private
    {
        System.out.println("ParkingLot object gets created");
    }

    public static ParkingLot getInstance()
    {
        if(instance == null)
        {
            instance = new ParkingLot(); //returns parkinglot object creation(method)
        }

        return instance;
    }

}

class program974X
{
    public static  void main(String A[])
    {
        ParkingLot pobj1 = ParkingLot.getInstance(); //receives -> new ParkingLot().
        ParkingLot pobj2 = ParkingLot.getInstance();

        System.out.println(pobj1 == pobj2);
       
    }
}
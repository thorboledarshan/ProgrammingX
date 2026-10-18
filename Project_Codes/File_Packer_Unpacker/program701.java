class program701
{
    public static void main(String A[]) 
    {
      String header = "Marvellous";
      
      System.out.println(header); 

      header = header.replaceAll("l","L");  //ISSUE SOLVED

      System.out.println(header);
    }
}
class program700
{
    public static void main(String A[]) 
    {
      String header = "Marvellous";
      
      System.out.println(header); 

      header.replaceAll("l","L");  //ISSUE

      System.out.println(header);
    }
}
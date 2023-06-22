import java.util.Scanner;
public class table{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int f;
    System.out.println("enter the number");
    f=s.nextInt();
    for(int i=1;i<=10;i++)
      {
        System.out.println(f+" * "+i+" = "+(f*i));
      }
      
      
      }
}
import java.util.Scanner;
public class primenumber{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int p,count=0;
    System.out.println("enter the number");
    p=s.nextInt();
    
    for(int i=1;i<=p/2;i++)
      {
        if(p%i==0)
        {
          count=count+1;
        }
      }
    if(count==1)
    {
      System.out.println("the number is prime number");
    }
    else
    {
      System.out.println("the number is not a prime number");
    }
  }
}

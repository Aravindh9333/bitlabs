import java.util.Scanner;
public class perfect{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int p,sum=0;
    System.out.println("enter the number");
    p=s.nextInt();
    
    for(int i=1;i<=p/2;i++)
      {
        if(p%i==0)
        {
          sum=sum+i;
        }
      }
    if(sum==p)
    {
      System.out.println("the number is perfect number");
    }
    else
    {
      System.out.println("the number is not a perfect number");
    }
  }
}
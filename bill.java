import java.util.Scanner;
public class bill{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int d;
    float total;
    System.out.println("enter the number of units");
    d=s.nextInt();
    if(d<=50)
{
total=d*3.5f;
}
else if(d<=150)

  
{
 total=(50*3.5f)+(d-50)*4.8f;
}
else if(d<=250)
{
 total=(50*3.5f)+(100)*4.8f+(d-150)*7.2f;
}
else
{
 total=(50*3.5f)+(100)*4.8f+(100)*7.2f+(d-250)*9.7f;
}
 total=total+(total*18)/100;
 System.out.println("total value is" + total);
    
    
  }
}
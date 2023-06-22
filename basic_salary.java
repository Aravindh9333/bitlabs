import java.util.Scanner;
public class basic_salary{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n;
    float hra,da,total; 
    System.out.println("enter the salary");
    n=s.nextInt();
    if(n<=10000)
{
     hra=(20*n)/100;
     da=(80*n)/100;
     total=n+hra+da;

}
else if(n<=20000)
{
hra=(n*25)/100;
da=(n*90)/100;
total=n+hra+da;

}
else
{
hra=(30*n)/100;
da=(95*n)/100;
total=n+hra+da;

  }
    System.out.println("total" + total);
}}
import java.util.Scanner;
public class factors{
public static void main(String args[])
  {
  Scanner s=new Scanner(System.in);
  int n,count=0,sum=0;
  System.out.println("enter the number");
  n=s.nextInt();
  
  for(int i=1;i<=n/2;i++)
    {
      if(n%i==0){
        System.out.println("the factors are " + i);
        count=count+1;
        sum=sum+i;
      }
     
    } System.out.println("the no.of factors " + count);
    System.out.println("the sum of factors "+ sum);
  }}
import java.util.Scanner;
public class factorial{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int f,result=1;
    System.out.println("enter the number");
    f=s.nextInt();
    for(int i=1;i<=f;i++){
      result=result*i;
      
      
    }
    System.out.println("the factorial is" + result);
  }
}
    
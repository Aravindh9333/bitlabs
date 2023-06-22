import java.util.Scanner;
public class positive_negative{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a;
    System.out.println("enter the number a");
    a=s.nextInt();
      if(a>0){
      System.out.println(a + "is positive");
      }else if(a<0)
    {
      System.out.println(a + "is negative");
    }else{
      System.out.println(a + "is zero");
    }
  }
}

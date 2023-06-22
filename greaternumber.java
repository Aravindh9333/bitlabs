import java.util.Scanner;
public class greaternumber{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int a,b,c;
  System.out.println("enter number a");
  a=s.nextInt();
  System.out.println("enter number b");
  b=s.nextInt();
  System.out.println("enter number c");
  c=s.nextInt();
  if(a>b && a>c){
    System.out.println(a + "is a greatest number");
  }else if(b>a && b>c){
    System.out.println(b + "is a greatest number");
  }else{
    System.out.println(c + "is the greatest number");
  }}




  
}

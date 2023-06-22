import java.util.Scanner;
public class leap_year{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int year;
    System.out.println("enter the year:");
    year = s.nextInt();
    if(year%4==0 && year%100!=0){
      System.out.println(year + "is a leap year");
    }else if (year%400==0){
      System.out.println(year + "is a leap year");
    }
    else {
      System.out.println(year + "is not a leap year");
    }
    
    
  }
}
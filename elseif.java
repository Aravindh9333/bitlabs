import java.util.Scanner;
public class elseif{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int time;
    System.out.println("enter the time");
    time=s.nextInt();
    
    if(time>=5 && time<=12)
    {
      System.out.println("good morning");
    }
    else if(time>=12 && time<16)
    {
     System.out.println("good afternoon"); 
    }else if(time>=16 && time<+20)
    {
      System.out.println("good evening");
  
    }else
    {
      System.out.println("good night");
    }
  }
}
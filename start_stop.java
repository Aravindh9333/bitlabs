import java.util.Scanner;
public class start_stop{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int i,start,stop;
    System.out.println("enter the start value");
    start=s.nextInt();
    System.out.println("enter the stop value");
    stop=s.nextInt();
    if(start<=stop)
    {
    for(i=start;i<=stop;i++){
        System.out.println("the values are " + i);
    }
    }else{
      for(i=start;i>=stop;i--){
       System.out.println("the values are " + i); 
      }
    }
    
    
  }
}

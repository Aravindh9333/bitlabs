//  Display failed subject name along with score.


import java.util.Scanner;
public class failedsubject
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int i,ps,es,is;
    float total;
    System.out.println("enter marks");
    ps=s.nextInt();
    System.out.println("enter marks");
    es=s.nextInt();
    System.out.println("enter marks");
    is=s.nextInt();
    if(ps>=50 && es>=50 && is>=50)
{
	total=(ps*70)/100 + (es*20)/100 + (is*10)/100;
    
	if(total>=90)
		System.out.println("A grade");
	else if(total<90 && total>=70)
		System.out.println("B grade");
	else if(total<70 && total>=50)
		System.out.println("C grade");
}
else {
	if(ps<50)
	{
		System.out.println(" Subject project score has less than 50 marks " + ps);
	}
	if(es<50)
	{
		System.out.println(" Subject external score has less than 50 marks " + es);
	}
	if(is<50)
	{
		System.out.println(" Subject internal score has less than 50 marks " + is);
	}
  }
  }}
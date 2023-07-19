package assignmentJuly17;
import java.util.Scanner;
class  InvalidExpressionException extends Exception{
	public  InvalidExpressionException(String e)
	{
		super(e);
	}
}

public class calculator {
	public static void main(String args[]) throws InvalidExpressionException 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number a");
		int a=s.nextInt();
		System.out.println("enter the number b");
		int b=s.nextInt();
		System.out.println("enter the operand +,-,%,/,*");
		String c=s.next();
		if(c.equals("+"))
		{
			System.out.println("teh addition of two numbers : "+(a+b));
		}
		else if(c.equals("-"))
		{
			System.out.println("the subraction of two numbers : "+(a-b));
		
		}
		else if(c.equals("%"))
		{
			System.out.println("the module of two number : "+(a%b));
		
		}
		else if(c.equals("*"))
		{
			System.out.println("the multiplication of two numbers :"+(a*b));
		}
		else if(c.equals("/"))
		{
			System.out.println("the division of two numbers : "+(a/b));
		}
		else
			try
		{
			throw new InvalidExpressionException("entered operand is not found");
		}
		catch(InvalidExpressionException e)
		{
			System.out.println(e);
		}
	}

}

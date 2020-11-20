package exception;

import java.util.Scanner;

class MyArithException extends Exception
{
	public MyArithException(String string)
	{
		super(string);
	}
}
class Calculator
{
public double caldouble(int a)throws MyArithException
{
if(a==0)
{
throw new MyArithException("zero is not allowed");	
}
else if(a<0)
{
throw new MyArithException("-ve is not allowed");
}
return a;
}
}
public class ClientApp {

	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter a no");
			int a =input.nextInt();	
		Calculator  ref = new Calculator();
		try
		{	
		double res=ref.caldouble(a);
		System.out.println(res);
		}
		catch(MyArithException e)
		{
			System.out.println(e);
		}
	}
}


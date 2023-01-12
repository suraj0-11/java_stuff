package suraj;
import java.util.*;
public class Except
{
	float c;
	void div(float a, float b)
	{
		try
		{
			c = a/b;
			System.out.println("Result : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by 0");
		}
	}
	public static void main(String args[])
	{
		Except obj = new Except();
		Scanner sur = new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		float no1 = sur.nextFloat();
		float no2 = sur.nextFloat();
		obj.div(no1, no2);
	}
}
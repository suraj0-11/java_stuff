import java.util.*;
public class prime_num {

	public static void main(String[] args) {
		Double num;
		int i;
		System.out.println("Enter the number : ");
        Scanner sur = new Scanner(System.in);
        num = sur.nextDouble();
        boolean flag = false;
        for(i=2;i<=num/2;++i)
        {
        	if(num % i == 0)
        	{
        		flag = true;
        		break;
        	}
        }
        if(!flag)
        	System.out.println(num+" is a prime number");
        else
        	System.out.println(num+" is not a prime number");
        sur.close();
	}

}

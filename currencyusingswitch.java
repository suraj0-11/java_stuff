import java.util.*;
public class currencyusingswitch
{
    public static void main(String[] args)
    {
    	double inr,yen;   
    	double usd;
    	System.out.println("Enter\n"
    			+ "1. for USD to INR\n"
    			+ "2. for INR to USD\n"
    			+ "3. for YEN to INR\n"
    			+ "4. for INR to YEN\n");
    	Scanner sur = new Scanner(System.in);
    	int choice = sur.nextInt();
    	switch(choice)
    	{
    	case 1 : System.out.println("Enter the amount in dollars : ");
    	         usd = sur.nextDouble();
    	         inr = usd*(82.73);
    	         System.out.println("Rs."+inr);
    	         break;
    	case 2 : System.out.println("Enter the amount in ruppees : ");
    	         inr = sur.nextDouble();
    	         usd = inr/(82.73);
    	         System.out.println("$"+usd);
    	         break;
    	case 4 : System.out.println("Enter the amount in ruppees : ");
                 inr = sur.nextDouble();
                 yen = inr*(1.65);
                 System.out.println(yen + " Yen");
                 break;
    	case 3 : System.out.println("Enter the amount in yen : ");
                 yen = sur.nextDouble();
                 inr = yen/(1.65);
                 System.out.println("Rs."+inr);
                 break;
    	}
    }
}

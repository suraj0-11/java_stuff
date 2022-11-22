import java.util.*;
public class staff {

	String staffid,name;
	long phone;
	float salary;
	public void accept()
	{
		Scanner sur = new Scanner(System.in);
		System.out.println("Entet staff id : ");
		staffid = sur.next();
		System.out.println("Enter name : ");
		name = sur.next();
		System.out.println("Ente your phone no. : ");
		phone = sur.nextLong();
		System.out.println("Enter your salary : ");
		salary = sur.nextFloat();
	}
	public void display()
	{
		System.out.println("Staff ID : "+staffid);
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phone);
		System.out.println("Salary : "+salary);
	}
	class Teaching extends staff
	{
		String domain;
		int n;
		public void accept()
		{
			super.accept();
			Scanner sur = new Scanner(System.in);
			System.out.println("Enter Domain : ");
			domain = sur.next();
			System.out.println("Enter number of publications : ");
			n = sur.nextInt();
			System.out.println("\n");
		}
		public void display()
		{
			super.display();
			System.out.println("Domain : "+domain);
			System.out.println("Publicatons : "+n);
			System.out.println("\n");
		}
	}
	class Technical extends staff 
	{
		String skill;
		public void accept()
		{
			super.accept();
			Scanner sur = new Scanner(System.in);
			System.out.println("Enter Technical skill : ");
			skill = sur.nextLine();
			System.out.println("\n");
		}
		public void display()
		{
			super.display();
			System.out.println("Technical skill : "+skill);
			System.out.println("\n");
		}
	}
	class Contract extends staff
	{
		int period;
		public void accept()
		{
			Scanner sur = new Scanner(System.in);
			System.out.println("Enter period : ");
			period = sur.nextInt();
		}
		public void dislay()
		{
			super.display();
			System.out.println("Contract period : "+period);
		}
	}
	class four
	{
		public static void main(String[] args)
		{
			Teaching teaching = new Teaching();
			System.out.println("Enter the details of the taeching staff : ");
			teaching.accept();
			Technical technical = new Technical();
			System.out.println("Enter the details of technical staff : ");
			technical.accept();
			Contract contract = new Contract();
			System.out.println("Enter the details of Contract staff : ");
			contract.accept();
			System.out.println("The details of Teaching staff\n");
			teaching.display();
			System.out.println("The details of Technical staff\n");
			technical.display();
			System.out.println("The details of Contract staff\n");
			contract.display();
		}
	}

}

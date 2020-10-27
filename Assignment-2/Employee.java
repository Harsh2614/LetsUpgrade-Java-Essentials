import java.util.*;

class Employee 
{

    static String name;
    static int date, month, year;
	static int age;
    static int salary, an_salary;
    static int tax;

	void compute()
	{
		if(an_salary<=200000)
		{
			tax=(an_salary*5)/100;
		}
		else if(an_salary>200000 && an_salary<=300000)
		{
			tax=(an_salary*10)/100;
		}
		else if(an_salary>300000 && an_salary<=400000)
		{
			tax=(an_salary*15)/100;
		}
		else if(an_salary>400000 && an_salary<=500000)
		{
			tax=(an_salary*20)/100;
		}
		else if(an_salary>500000)
		{
			tax = (an_salary*25)/100;
		}
	}

	void display()
	{
		System.out.println("Name Is : "+name);
		System.out.println("Age Is : " +age);
		System.out.println("Annual Salary Is : " +an_salary);
		System.out.println("Tax Amount Is : " +tax);
	}

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Plzz Enter Your Name");
		name=sc.nextLine();
		System.out.println("Plzz Enter Your Date Of Birth");
		date=sc.nextInt();
		System.out.println("Plzz Enter Your Month Of Birth");
		month=sc.nextInt();
		System.out.println("Plzz Enter Your Year Of Birth");
		year=sc.nextInt();
		System.out.println("Plzz Enter Your Monthly Salary");
		salary=sc.nextInt();

		age = 2020-year;
		an_salary = 12*salary;

		Employee e1 = new Employee();
		e1.compute();
		e1.display();

	}
}



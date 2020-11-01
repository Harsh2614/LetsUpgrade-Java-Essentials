class Employee 
{
	String name;
	int age, salary;
	String designation;

	void getDetails()
	{

		name = "Harsh";
		age = 20;
		salary = 50000;
		designation = "Sales";

	}

	void dispDetails()
	{

		System.out.println("Your Name : " +name);
		System.out.println("Your Age : " +age);
		System.out.println("Your Salary : " +salary);
		System.out.println("Your Designation : " +designation);

	}
}

class Doctor
{

		String name, speciality;
		int expereince, salary;

}

class Engineer
{

		String name, speciality;
		int salary;

}

class Pilot
{

		String name;
		int licenseNo, salary;

}

public static void main(String[] args) 
{
		
		Employee e[] = new Employee[3];

		for(int i=0;i<3;i++)
		{

			e[].getDetails();
			e[].displayDetails();
		}
}

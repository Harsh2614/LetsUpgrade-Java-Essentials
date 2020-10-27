class  Employee
{
	String name;
	int age;
	String city;

	void accept(String n, int a, String c) 
    {
             name = n;
             age = a;
			 city = c;
    }

	void display()
    {
		   System.out.println("The name is "+name);
           System.out.println("The age is "+age);
		   System.out.println("The city is "+city);
		   System.out.println("\n");
	}

	public static void main(String[] args) 
	{
		   Employee e1 = new Employee();
           e1.accept("Harsh",20,"Agra");
           e1.display();

           Employee e2 = new Employee();
           e2.accept("Rohit",31,"Mumbai");
           e2.display();

	}
}

import java.util.*;
class Avenger
{

    public String name;
    public int age;
    public String power, weapon, planet;         

    public void getDetails()
	{
		
		Scanner sc=new Scanner(System.in);

        System.out.println("Plzz Enter The Name Of Avenger ");
        name=sc.next();
        System.out.println("Plzz Enter The Age Of Avenger ");
        age=sc.nextInt();
        System.out.println("Plzz Enter The Power Of Avenger ");
        power=sc.next();
        System.out.println("Plzz Enter The Weapon Of Avenger ");
        weapon=sc.next();
        System.out.println("Plzz Enter The Planet Of Avenger ");
        planet=sc.next();

    }

    public void displayDetails()
	{

        System.out.println("Name Is : " +name);
        System.out.println("Age Is : " +age);
        System.out.println("Power Is : " +power);
        System.out.println("Weapon Is : " +weapon);
        System.out.println("Planet Is : " +planet);

    }

	public static void main(String args[])
	{
		 Avenger[] ave = new Avenger[5];

		 for(int i=0;i<5;i++)
		{
			ave[i] = new Avenger();
			ave[i].getDetails();
			ave[i].displayDetails();
		}
	}
}
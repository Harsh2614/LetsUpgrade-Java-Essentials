import java.util.*;

public class Marks 
{
	 public static void main(String[] args) 
	 {
	    int num1, num2, num3, num4, num5;
        double percent;

        Scanner sc=new Scanner(System.in);

        System.out.println("Plzz Enter The Marks Of 1st Subject : ");
        num1=sc.nextInt();
        System.out.println("Plzz Enter The Marks Of 2nd Subject : ");
        num2=sc.nextInt();
        System.out.println("Plzz Enter The Marks Of 3rd Subject : ");
        num3=sc.nextInt();
        System.out.println("Plzz Enter The Marks Of 4th Subject : ");
        num4=sc.nextInt();
        System.out.println("Plzz Enter The Marks Of 5th Subject : ");
        num5=sc.nextInt();

        percent = (num1+num2+num3+num4+num5)/5;

        if(percent>=90 && percent<=100)
        {
            System.out.println("You Have A Grade");
			System.out.println("Your Scored : " +percent + " %"); 
        }
        else if(percent>=70 && percent<=89)
        {
            System.out.println("You Have B Grade");
			System.out.println("Your Scored : " +percent + " %");
        }
        else if(percent>=50 && percent<=69)
        {
            System.out.println("You Have C Grade");
			System.out.println("Your Scored : " +percent + " %");
        }
        else if(percent>=35 && percent<=49)
        {
            System.out.println("You Have D Grade");
			System.out.println("Your Scored : " +percent + " %");
        }
        else if(percent>=1 && percent<=34)
        {
            System.out.println("You Have E Grade");
			System.out.println("Your Scored : " +percent + " %");
        }

    }
}

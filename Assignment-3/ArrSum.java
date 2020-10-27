import java.util.*;
class ArrSum 
{

    public static void main(String[] args) 
	{
  
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int a[] = new int[5];
        System.out.println("Plzz Enter Any 5 Numbers : ");
        for (int i = 0; i < 5; i++) 
		{
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        
		System.out.print("The Sum Of Inputted Numbers Are : " +sum);

        }
}

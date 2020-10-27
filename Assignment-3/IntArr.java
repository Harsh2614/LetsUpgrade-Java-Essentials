import java.util.*;
class IntArr 
{

    public static void main(String[] args) 
	{
   
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        System.out.println("Plzz Enter Any 5 Numbers : ");
        for (int i=0; i<5; i++) 
		{
            a[i] = sc.nextInt();
        }

        System.out.print("List Of Odd Numbers From Inputted List Are : ");
        for (int i = 0; i < 5; i++) 
		{
            if (a[i]%2 != 0) 
			{
                System.out.print(a[i] + " ");
            }
        }
    }
}

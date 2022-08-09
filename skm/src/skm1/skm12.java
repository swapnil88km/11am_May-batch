package skm1;

import java.util.Scanner;

public class skm12 
{
public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int number= s.nextInt();
		int half= number/2;
		int count =0;
		
		for (int i=1;i<=half;i++)

		{
			if (number%i==0)
			{
			System.out.println("its a prime number"+ number);
			count=1;
			break;
		    }
		if (count==0)
				
		{
			System.out.println("is not a prime number");
		}
	}
}
}


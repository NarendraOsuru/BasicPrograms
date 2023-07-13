package NumberBased;
import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) 
	{
		int r,sum=0,temp;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n= s.nextInt();
		temp=n;
		while (n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (temp==sum)
		{
			System.out.println(" the number "+temp+ " is a Palindrome");

		}
		else 
		{
			System.out.println(" the number "+temp+ " is not a Palindrome");
		}
	}

}

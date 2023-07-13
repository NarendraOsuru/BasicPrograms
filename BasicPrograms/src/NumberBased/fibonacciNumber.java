package NumberBased;
import java.util.Scanner;

public class fibonacciNumber {
	public static void main(String[] args) 
	{
		Scanner S= new Scanner(System.in);
        System.out.print("Enter the count= ");
		int count=S.nextInt();
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for (int i=2;i<count ;i++ )
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
         
	}

}

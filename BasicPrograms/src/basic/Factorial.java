package basic;

import java.util.Scanner;

public class Factorial {
	//using recursion
	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		s.close();
		int fact=1,n;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println(num+" factorial is "+fact);
		//using recursion
		n=factorial(num);
		System.out.println(num+" factorial is "+n);

	}

}

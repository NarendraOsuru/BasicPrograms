package basic;

import java.util.Scanner;
// using method
public class PrimenumRec {
	static void checkPrime(int num) {
		int flag=0;
		if(num==0||num==1) {
			System.out.println("0 And 1 are not Prime numbers");
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println(num+" is not a prime number");
					flag=1;
					break;
					
				}	
			}
		}
		if(flag==0) {
			System.out.println(num+" is a prime number");
		}
	}
	//using recursion
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		System.out.println("enter the number 2");
		int num2=s.nextInt();
		s.close();
		checkPrime(num);
		if(isPrime(num2)) {
			System.out.println(num2+" is a prime number");
			
		}else {
			System.out.println(num2+" is not a prime number");
		}
		//finding prime numbers between two numbers
		for(int i=num;i<=num2;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				
			}
			
		}
		
	}

}

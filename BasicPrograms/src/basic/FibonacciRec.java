package basic;

import java.util.Scanner;

public class FibonacciRec {
	static int n1=0,n2=1,n3=0;
	static void PrintFibonacci(int num) {
		if(num>0) {
			n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         PrintFibonacci(num-1);    
		}
		
	}
	


public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int num=s.nextInt();
	s.close();
	System.out.print(n1+" "+n2);
	PrintFibonacci(num-2);
}
}
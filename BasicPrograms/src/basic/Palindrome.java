package basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		s.close();
		int temp=0,r,sum=0;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a Palindrome ");
		}else {
			System.out.println(temp+" is not a Palindrome");
		}

	}

}

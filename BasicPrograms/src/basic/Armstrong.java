package basic;

import java.util.Scanner;

public class Armstrong {
	static boolean isArmstrong(int n) {
		int temp,digits=0,last=0,sum=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+=(Math.pow(last, digits));
			temp=temp/10;
		}
		if(n==sum) {
			return true;
		}else
			return false;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		s.close();
		//printing Armstrong numbers up to the given number
		for(int i=0;i<=num;i++) {
			if(isArmstrong(i))
				System.out.print(i+",");
		}
		//Checking the number is Armstrong or not
		if(isArmstrong(num)) {
			System.out.println("the"+num+" is armstrong");
		}else
			System.out.println("the"+num+" is not armstrong");

	}

}

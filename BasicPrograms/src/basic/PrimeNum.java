package basic;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		s.close();
		int flag=0,m=num/2;
		if(num==0||num==1) {
			System.out.println("0 And 1 are not Prime numbers");
		}
		else {
			for(int i=2;i<=m;i++) {
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

}

package basic;
import java.util.*;
public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		s.close();
		int n1=0,n2=1,n3;
		System.out.print(n1+ " "+n2);
		for(int i=2;i<=num;++i) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

		
	}

}

package basic;
import java.util.Random;

public class RandomNUm {

	public static void main(String[] args) {
		System.out.println("1st Random num:"+Math.random());
		int max=200,min=400;
		double a=Math.random()*(max-min+1)+min;
		System.out.println(a);
		double b=Math.random()*(max-min+1)+min;
		System.out.println(b);
		Random r=new Random();
		int x=r.nextInt(50);
		int y=r.nextInt(1000);
		System.out.println(x);
		System.out.println(y);
		double c=r.nextDouble();
		System.out.println(c);
		float f=r.nextFloat();
		System.out.println(f);
		long p=r.nextLong();
		System.out.println(p);
				
	}

}

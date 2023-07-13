package basic;
import java.util.Scanner;
class Arthimatic 
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("First Number =");
		int A= input.nextInt();
		System.out.println("Second Number =");
		int B= input.nextInt();
		int Add= A+B;
		int Substract= A-B;
		int product= A*B;
		int Division= A%B;
        System.out.println("Addition of two numbers ="+Add);
		System.out.println("Substraction of two numbers ="+Substract);
		System.out.println("Product of two numbers ="+product);
		System.out.println("modulus of two numbers ="+Division);
	}
}

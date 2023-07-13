package AutomorphicNumber;

public class Automorphic {
	static boolean isAutomorphic(int num)   
	{   
	//determines the square of the specified number  
	int square = num * num;   
	//comparing the digits until the number becomes 0  
	while (num > 0)   
	{   
	//find the remainder (last digit) of the variable num and square and comparing them  
	if (num % 10 != square % 10)   
	//returns false if digits are not equal  
	return false;   
	//reduce num and square by dividing them by 10  
	num = num/10;   
	square = square/10;   
	}   
	return true;   
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
		System.out.println(isAutomorphic(625) ? "Automorphic" : "Not Automorphic"); 

	}

}

package basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String/number");
		String original=s.nextLine();
		String reverse="";
		s.close();
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println(original+" is a palindrome");
		}else {
			System.out.println(original+" is not a palindrome");
		}
	}

}

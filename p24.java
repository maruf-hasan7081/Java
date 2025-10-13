//Write a Java program to print the multiplication table of any number entered by the user.

import java.util.Scanner;

public class p24{
	public static void main(String[] args){
		Scanner sca= new Scanner(System.in);
		System.out.print("enter number: ");
		int number=sca.nextInt();
		
		for(int i=1; i<=10; i++){
			System.out.println(number+"x"+i+"="+(number*i));
		}
	}
}
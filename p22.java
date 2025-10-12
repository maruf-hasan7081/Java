//Write a Java program that keeps taking numbers from the user until the user enters 0, then prints the sum of all entered numbers.
//(Hint: use do-while loop)

import java.util.Scanner;
public class p22{
	public static void main(String[] args){
		
		Scanner sca = new Scanner(System.in);
		int n;
		int sum=1;
		
	
		do{
			System.out.print("Enter number: ");
		    n =sca.nextInt();
			
			sum+=n;
		}while(n!=0);
		
		System.out.print("sum is : " +sum);
		
		
		
		
		
	}
}
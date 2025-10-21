//Write a method that takes 3 numbers and returns the largest.
//2nd task 3 ta number jdi int hoi tahole numbers method kaj korbe r jdi 3 ta number double hoi tahole numbers2 method kaj korbe......solve hoi nai pore update kora hobe 
import java.util.Scanner;
public class p33{
	
	void numbers(int a, int b, int c){
		
		if(a>b && a>c){
			System.out.println("the largest number:"+a);
		}
		else if(b>a && b>c){
			System.out.println("the largest number:"+b);
		}
		else
          System.out.println("the largest number:"+c);			
			
	}
	
	double numbers2(double a ,double b, double c){
		
		if(a>b && a>c){
			return a;
		}
		else if(b>a && b>c){
			return b;
		}
		else
          return c;			
			
	}
		
	
	public static void main(String [] args){
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		int a =sca.nextInt();
		int b =sca.nextInt();
		int c =sca.nextInt();
		p33 ab= new p33();
		
		ab.numbers(a,b,c);
		double largestnumber=ab.numbers2(a,b,c);
		System.out.println("hello the "+largestnumber);
		
		
			
	}
	
}
import java.util.Scanner;
public class p27{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter digit: ");
		int number=sc.nextInt();
		int sum = 0, di;
		while(number>0)
		{di =number%10;
		     sum = sum*10 + di;
		number= number/10;}
		
		System.out.println("the reverse fuction is:" + sum);
		
		
	}
}
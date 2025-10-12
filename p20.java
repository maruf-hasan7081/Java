import java.util.Scanner;
public class p20{
	public static void main(String[] args){
		Scanner sca =new Scanner(System.in);
		System.out.print("enter integer number: ");
		int N=sca.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=N; i++){
			sum+=i;
		}
		System.out.print("sum is:"+sum);
		
		
		
		
		
	}
}
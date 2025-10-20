
//Write a method that checks if a number is even or odd.

public class p32{
	
	void Check (int num){
		if (num%2==0){
			System.out.println("even");
		}
		else
			System.out.println("odd");
		
	}
	
	public static void main(String [] args )
	{
		p32 a =new p32();
		a.Check(5);
	}
}
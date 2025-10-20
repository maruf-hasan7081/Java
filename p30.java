//BMI calculation 

public class p30{
	double bmicalculation(double w, double h){
		return w/h*h;
		
		
	}
		
	
	
	
	
	public static void main(String[] args){
		p30 a=new p30();
		double BMI=a.bmicalculation(50,1.80);
		System.out.println("BMI is : "+BMI);
		
		
		
		
	}
	
}
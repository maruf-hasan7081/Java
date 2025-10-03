import java.util.Scanner;
public class p12 {

    public static void main(String[] args) {

        Scanner sca= new Scanner(System.in);


        System.out.println("number is:");
        int number=sca.nextInt();

        //int number =5;



        if(number%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");

        }
        
    }
    
}

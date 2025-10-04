import  java.util.Scanner;

public class p15 {

    public static void main(String[] args) {
        
        Scanner sca= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sca.nextInt();

        if(age<13){
            System.err.println("child");
        }
        else if(age<=19){
            System.err.println("Teenager");
        }
         else if(age>19 && age<=59){
            System.err.println("Adult");
        }
        else if(age>=60){
            System.err.println("Senior Citizen");
        }
        else{
            System.err.println("Invalid Input");
        }


    }
    
}

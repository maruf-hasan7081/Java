import java.util.Scanner;
public class ps1 {
    public static void main(String[] args){
       // Scanner sca= new Scanner(System.in);
        Scanner sca=new Scanner(System.in);

        System.out.print("enter your name :");
        String name=sca.nextLine();

        System.out.print("Enter marks1:");
        double marks1=sca.nextDouble();


        System.out.print("Enter marks2:");
        double marks2=sca.nextDouble();


        System.out.print("Enter marks3:");
        double marks3=sca.nextDouble();

        double total=(marks1+marks2+marks3);
        double avg =total/3;

        System.out.println("Student:"+name);
        System.out.println("total marks:"+total);
        System.out.println("average:"+avg);




    }
    
}

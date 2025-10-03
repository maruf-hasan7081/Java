import java.util.Scanner;

public class A1 {

    public static void main(String[] args)
    {
        Scanner sca=new Scanner(System.in);

        System.out.println("enter x");
        double x= sca.nextDouble();

        System.out.println("enter y");
        double y= sca.nextDouble();

        System.out.println("enter z");
        double z= sca.nextDouble();



        double sum=(x+y);
        double sub=(x-y);
        double multi=(x*y);
        double div=(x/y);
        double avg=(x+y+z)/3;

        System.out.println("sum is "+sum);
        System.out.println("sub is "+sub);
        System.out.println("multi is "+multi);
        System.out.println("div is "+div);
        System.out.println("avg is "+avg);

    }
    
}

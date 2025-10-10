import java.util.Scanner;
public class P16 {

    public static void main(String[] args) 
    {
        Scanner sca= new Scanner(System.in);

        System.out.print("Enter day number (1-7):");
        int day= sca.nextInt();

        switch(day){
            case 1:
            System.out.print("monday");
            break;

            case 2:
            System.out.print("tuesday");
            break;

            
            case 3:
            System.out.print("wednesday");
            break;

            
            case 4:
            System.out.print("thusday");
            break;

            
            case 5:
            System.out.print("friday");
            break;

            
            case 6:
            System.out.print("Saturday");
            break;

            
            case 7:
            System.out.print("sunday");
            break;

        }


    }
    
}


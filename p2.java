import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sca.nextLine();
        System.out.println("hello:" + name + "");

        System.out.println("enter an inter number :");
        int x = sca.nextInt();
        System.out.println("integer number:" + x + "");

        System.out.println("enter an floate number :");
        double y = sca.nextDouble();
        System.out.println("double number:" + y + "");

    }
}

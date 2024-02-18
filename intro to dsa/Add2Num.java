import java.util.Scanner;

public class Add2Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = scan.nextInt();
        System.out.print("Enter Num2:");
        int n2 = scan.nextInt();

        float f = scan.nextFloat();

        double d = scan.nextDouble();
        System.out.print("Enter bolean value:");
        boolean b = scan.nextBoolean();
        System.out.println("Sum of Two Number is: "+(n1+n2));
    }
}

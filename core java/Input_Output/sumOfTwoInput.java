package Input_Output;
import java.util.Scanner;
public class sumOfTwoInput {
    public static void main(String[] args) {
        Scanner give = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = give.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = give.nextInt();
        int sum = a+b;
        System.out.println("The sum of two Number: " +sum);
    }
}
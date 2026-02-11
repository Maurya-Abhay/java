package conditionalStatement;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = in.nextInt();
        System.out.print("Enter Operation Button: ");
        int button = in.nextInt();
        if (button == 1) {
            System.out.println(a+b);
        }
        else if (button == 2) {
            System.out.println(a-b);
        }
        else if (button == 3) {
            System.out.println(a*b);
        }
        else if (button == 4) {
            System.out.println(a/b);
        }
        else if (button == 5) {
            System.out.println(a%b);
        }else{
            System.out.println("Invalid Options");
        }
    }
}

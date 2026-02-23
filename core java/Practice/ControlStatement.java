package Practice;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Odd or Even: ");
        int number = sc.nextInt();
        if(number % 2 == 0) {
            System.out.println(number + " is a Even number");
        }else {
            System.out.println(number + " is a Odd number");
        }
    }
}
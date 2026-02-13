package Loops;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        //Print the sum of n Natural Numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the any natural Numbers: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

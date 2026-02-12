package Array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        // input values store in the array
        for (int i = 0; i<size; i++) {
            System.out.print("Enter " +i+ " number value: ");
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the searching values:");
        int x = in.nextInt();

        // output print using the loop
        for (int i = 0; i<arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("Your searching length is: "+i);
            }
        }
    }
}

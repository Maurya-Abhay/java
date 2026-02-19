package Array2D;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = in.nextInt();
        System.out.print("Enter the number of col: ");
        int col = in.nextInt();
        // 2D Array define
        int[][] numbers = new int[row][col];

        //input
        for (int i = 0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = in.nextInt();
            }
        }
        // Searching field
        System.out.print("Enter Searching value: ");
        int x = in.nextInt();
        //output
        for (int i=0; i<row; i++) {
            for (int j = 0; j<col; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Your search value at row no "+i +" and col is "+ j);
                }
            }
        }
    }
}

package Array2D;

import java.util.Scanner;

public class simpleExamole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int col = in.nextInt();

        int[][] numbers = new int[rows][col];
        // input valus
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<col; j++) {
                numbers[i][j] = in.nextInt();
            }
        }

        //output valus
        for (int i = 0; i<rows; i++) {
            for (int j = 0; j<col; j++) {
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }
    }
}

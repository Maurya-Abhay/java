package Recursion;

public class calculatePowerLogn {
    public static int printLogN(int x, int n) {
        if(x == 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        // Even number
        if(n % 2 == 0) {
            return printLogN(x, n/2) * printLogN(x, n/2);
        }else{
            // Odd number
            return printLogN(x, n/2) * printLogN(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int finals = printLogN(x, n);
        System.out.println(finals);
    }
}

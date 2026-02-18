package Recursion;

public class calculatePower {
    public static int printPower(int x, int n) {
        if(x == 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        int nm1 = printPower(x, n-1);
        int xpower = x * nm1;
        return xpower;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int power = printPower(x,n);
        System.out.println(power);
    }
}

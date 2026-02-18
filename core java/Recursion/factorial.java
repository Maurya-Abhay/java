package Recursion;

public class factorial {
    public static int printFactorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        int fact1 = printFactorial(n-1);
        int fact_n = n * fact1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 5;
        int answer = printFactorial(n);
        System.out.println(answer);
    }
}

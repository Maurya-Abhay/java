package Recursion;

public class sumNaturalNumber {
    public static void printSumNaturalNo(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSumNaturalNo(i+1, n, sum);
    }
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int sum = 0;
        printSumNaturalNo(i,n,sum);
    }
}

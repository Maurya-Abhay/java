package GitManipulations;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0:CLEAR and 1:SET: ");
        int operation = sc.nextInt();
        //input 1 then set else 0 clear
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        if (operation == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else {
            int notNumber = ~(bitMask);
            int newNumber = notNumber & n;
            System.out.println(newNumber);
        }
    }
}

package conditionalStatement;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Button: ");
        int button = in.nextInt();
        switch (button){
            case 1:
                System.out.println("Jai shree Ram");
                break;
            case 2:
                System.out.println("Har Har Mahadev");
                break;
            case 3:
                System.out.println("jai Mata di");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}

package conditionalStatement;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int no = input.nextInt();
        if(no%2==0){
            System.out.println("Given Number is Even");
        }else{
            System.out.println("Given number is Odd");
        }
    }
}

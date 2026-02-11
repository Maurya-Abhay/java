package conditionalStatement;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        if(age > 18){
            System.out.println("Adult");
        }else {
            System.out.print("Not Adult");
        }
    }
}

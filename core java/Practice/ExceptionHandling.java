package Practice;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int numbers = sc.nextInt();
        try{
            if(numbers % 2 == 0){
                System.out.println("This is risky code " + numbers);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Program completed");
        }
    }
}

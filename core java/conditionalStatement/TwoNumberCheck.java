package conditionalStatement;
import java.util.Scanner;
public class TwoNumberCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = in.nextInt();
        if(a == b){
            System.out.println("Equal");
        }else{
            if(a > b){
                System.out.println("A is Greater");
            }else{
                System.out.println("B is Greater");
            }
        }
    }
}

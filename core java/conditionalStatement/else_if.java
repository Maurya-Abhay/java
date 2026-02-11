package conditionalStatement;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any 1 to 3 Number: ");
        int x = in.nextInt();
        if(x == 1){
            System.out.println("Pranam 🙏");
        }else if(x == 2){
            System.out.println("Namste ");
        }else if(x == 3){
            System.out.println("Hello");
        }else{
            System.out.println("Invalid Options");
        }
    }
}

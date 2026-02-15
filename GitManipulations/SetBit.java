package GitManipulations;

public class SetBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1; // 0001
        int bitMask = 1<<pos; //0010
        int newValues = bitMask | n; // 0010 | 0101 = 0111
        System.out.println(newValues); //0111= 7
    }
}

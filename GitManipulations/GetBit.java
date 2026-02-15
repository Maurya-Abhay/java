package GitManipulations;

public class GetBit {
    public static void main(String[] args) {
        int n = 5;  //0101
        int pos = 2; //0010
        int bitMask = 1<<pos; // 0100

        if((bitMask & n) == 0) { // (0100 & 0101 = 0100)
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was one");
        }
    }
}

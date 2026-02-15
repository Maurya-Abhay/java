package GitManipulations;

public class ClearBit {
    public static void main(String[] ags) {
        int n = 5; // 0101
        int pos = 2; //0001
        int bitMask = 1<<pos; //0100
        int notBitMask = ~(bitMask); //1011
        int newNumber = notBitMask & n; // 1011 & 0101 = 0001
        System.out.println(newNumber); // output = 0001 (1)
    }
}

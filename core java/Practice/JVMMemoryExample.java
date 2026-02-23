package Practice;
public class JVMMemoryExample {

    int instanceVariable = 10; // Heap memory me store hoga

    public void show() {
        int localVariable = 20;
        // localVariable Stack memory me store hota hai

        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {

        // Object Heap me create hota hai
        JVMMemoryExample obj = new JVMMemoryExample();

        obj.show();

        // Stack me main() ka frame banta hai
    }
}

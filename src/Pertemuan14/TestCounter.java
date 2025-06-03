package Pertemuan14;
// Tugas 3
public class TestCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        System.out.println("Instance Count yang dibuat: " + Counter.getInstanceCount());
    }
}
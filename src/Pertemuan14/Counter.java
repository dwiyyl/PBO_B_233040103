package Pertemuan14;
// Tugas 3
public class Counter {
    static int instanceCount = 0; // Variabel static untuk menghitung objek

    public Counter() {
       instanceCount++; // Naik setiap objek dibuat
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
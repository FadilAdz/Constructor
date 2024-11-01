// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan class Programmer
        Programmer p1 = new Programmer("Udin");
        Programmer p2 = new Programmer("Surti", 6000000);
        Programmer p3 = new Programmer("Pedro", 5000000, 3000000);
        
        // Mencetak informasi
        System.out.println("=== Info Programmer 1 ===");
        p1.cetakInfo();
        System.out.println("\n=== Info Programmer 2 ===");
        p2.cetakInfo();
        System.out.println("\n=== Info Programmer 3 ===");
        p3.cetakInfo();
        
        // Contoh penggunaan class Manager
        Manager m1 = new Manager("Reza");
        Manager m2 = new Manager("Susanto", 8000000);
        Manager m3 = new Manager("Arap", 7000000, 2000000);
        
        // Mencetak informasi
        System.out.println("\n=== Info Manager 1 ===");
        m1.cetakInfo();
        System.out.println("\n=== Info Manager 2 ===");
        m2.cetakInfo();
        System.out.println("\n=== Info Manager 3 ===");
        m3.cetakInfo();
    }
}
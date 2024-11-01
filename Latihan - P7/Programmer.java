// File: Programmer.java
public class Programmer extends Pegawai {
    private double bonus;
    
    // Konstruktor default
    public Programmer() {
        super();
        this.bonus = 0.0;
    }
    
    // Konstruktor dengan nama
    public Programmer(String nama) {
        super(nama);
        this.bonus = 0.0;
    }
    
    // Konstruktor dengan nama dan gaji pokok
    public Programmer(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.bonus = 0.0;
    }
    
    // Konstruktor dengan nama, gaji pokok, dan bonus
    public Programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus: " + bonus);
    }
    
    public void cetakBonus() {
        System.out.println("Bonus: " + bonus);
    }
}
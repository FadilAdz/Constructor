// File: Manager.java
public class Manager extends Pegawai {
    private double tunjangan;
    
    // Konstruktor default
    public Manager() {
        super();
        this.tunjangan = 0.0;
    }
    
    // Konstruktor dengan nama
    public Manager(String nama) {
        super(nama);
        this.tunjangan = 0.0;
    }
    
    // Konstruktor dengan nama dan gaji pokok
    public Manager(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = 0.0;
    }
    
    // Konstruktor dengan nama, gaji pokok, dan tunjangan
    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    public double getTunjangan() {
        return tunjangan;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
    
    public void cetakTunjangan() {
        System.out.println("Tunjangan: " + tunjangan);
    }
}